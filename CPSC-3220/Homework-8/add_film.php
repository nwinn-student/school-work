<!doctype html>

<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>ADD FILM</title>

        <!-- Load external CSS styles -->
	<link rel="stylesheet" href="styles.css">
    </head>

    <body>
	<div style="background-color: rgb(51, 51, 51);">
            <h1>Add Film</h1>
        </div>
	<?php
		//Connect to SQL
		$server='localhost';
		$user='root';
		$pass='';
		$database='sakila';
		
		$mysqli = '';
		try{
			$mysqli = new mysqli($server,$user,$pass,$database);
		}
		//Error with SQL checker
		catch(Exception $e){
			die("<p>Error: Cannot connect to database $database on server $server using username $user (Error No.".mysqli_connect_errno().", ".mysqli_connect_error().")</p>	<button><a href='manager.html' title='Manager' alt='Manager'>Click here to return</a></button>
");
		}
		mysqli_report(MYSQLI_REPORT_ERROR | MYSQLI_REPORT_STRICT);
		$mysqli->set_charset("utf8mb4");
		
		//Posts
		$title = strval($_POST['title']);
		$description = strval($_POST['description']);
		$releaseYear = intval($_POST['release_year']);
		$langId = intval($_POST['lang_id']);
		$rentalDuration = intval($_POST['rental_duration']);
		$rentalRate = doubleval($_POST['rental_rate']);
		$length = intval($_POST['length']);
		$replacementCost = doubleval($_POST['replacement_cost']);
		$rating = strval($_POST['rating']);
		$specFeatures = strval($_POST['spec_features']);
		
		//Update Database
		$query = "INSERT INTO sakila.film (title,description,release_year,language_id,rental_duration,rental_rate,length,replacement_cost,rating,special_features) VALUES (?,?,?,?,?,?,?,?,?,?);";
		
		$stmt = $mysqli->prepare($query);
		$stmt->bind_param("ssiiididss", $title, $description, $releaseYear, $langId, $rentalDuration, $rentalRate, $length, $replacementCost, $rating, $specFeatures);
		//Check for error in query
		try{
			$result = $stmt->execute();
		}
		catch(Exception $e){
			die("<p>Could not successfully run query ($query) from $database:".mysqli_error($connect)."</p><button><a href='manager.html' title='Manager' alt='Manager'>Click here to return</a></button>");
		}

		//No error
		print("<p>Success</p>");
		
		//Disconnect from SQL
		$stmt->close();
	?>
	<!--reference back to initial html page-->
	<button><a href="manager.html" title="Manager" alt="Manager">Click here to return</a></button>
    </body>