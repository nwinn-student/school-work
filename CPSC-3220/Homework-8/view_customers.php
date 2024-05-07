<!doctype html>

<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>VIEW CUSTOMERS</title>

        <!-- Load external CSS styles -->
	<link rel="stylesheet" href="styles.css">
    </head>

    <body>
	<div style="background-color: rgb(51, 51, 51);">
            <h1>View Customers</h1>
        </div>
	<?php
		//Connect to SQL
		$server='localhost';
		$user='root';
		$pass='';
		$database='sakila';
		$connect = '';
		try{
			$connect = mysqli_connect($server,$user,$pass,$database);
		} catch(Exception $e){
			die("<p>Error: Cannot connect to database $database on server $server using username $user (Error No. ".mysqli_connect_errno().", ".mysqli_connect_error().")</p>	<button><a href='manager.html' title='Manager' alt='Manager'>Click here to return</a></button>");
		}
		
		//Obtain Query Results
		$query = "SELECT customer.first_name, customer.last_name, address.address, city.city, 
	address.district, address.postal_code
FROM sakila.customer, sakila.address, sakila.city
WHERE customer.address_id = address.address_id AND address.city_id = city.city_id
ORDER BY last_name, first_name, address, city, district, postal_code
ASC; ";

		//Check for error in query
		try{
			$result = mysqli_query($connect, $query);
		}
		catch(Exception $e){
			die("<p>Could not successfully run query ($query) from $database:".mysqli_error($connect)."</p><button><a href='manager.html' title='Manager' alt='Manager'>Click here to return</a></button>");
		}
		
		//Results checker
		if(mysqli_num_rows($result) == 0){
			print("No records were found with query $query");
		}
		else{
			//Variables, to ensure that space is not wasted
			$row; $firstName; $lastName; $address; $city; $district; $postalCode; $countFilmQuery; $count; $counter; $innerRow;
			
			//Output
			print("<table>");
			print("<tr><th>First Name</th><th>Last Name</th><th>Address</th><th>City</th><th>District</th><th>Postal Code</th><th>Film Titles</th></tr>");
			while($row = mysqli_fetch_assoc($result)){
				//Rows of Table
				$firstName = $row['first_name'];
				$lastName = $row['last_name'];
				$address = $row['address'];
				$city = $row['city'];
				$district = $row['district'];
				$postalCode = $row['postal_code'];
				print("<tr><td>".$firstName."</td><td>".$lastName."</td><td>".$address."</td><td>".$city."</td><td>".$district."</td><td>".$postalCode."</td><td>");
				
				//Title Query
				$countFilmQuery = "SELECT film.title
FROM sakila.customer, sakila.address, sakila.city, sakila.film, sakila.rental, sakila.inventory
WHERE customer.address_id = address.address_id AND address.city_id = city.city_id AND 
	customer.customer_id = rental.customer_id AND rental.rental_id = inventory.inventory_id 
	AND inventory.film_id = film.film_id AND customer.first_name = '$firstName' AND 
	customer.last_name = '$lastName' AND address.address = '$address';"; //should be enough to identify
				$count = mysqli_query($connect, $countFilmQuery);

				//usefull for ensuring that the last one doesn't have a comma
				$counter = 0;
				while($innerRow = mysqli_fetch_assoc($count)){
					if($counter != 0){
						print(", ".$innerRow['title']);
					}
					else{ //First innerrow**
						print($innerRow['title']);
						$counter++;
					}
				}
				$counter = 0;
				print("</td></tr>");
			}
			print("</table>\n<p></p>");
		}
		//Disconnect from SQL
		mysqli_close($connect);
	?>
	<!--reference back to initial html page-->
	<button><a href="manager.html" title="Manager" alt="Manager">Click here to return</a></button>
    </body>