<!doctype html>

<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>PHP</title>

        <!-- Load external CSS styles -->
	<link rel="stylesheet" href="styles.css">
    </head>

    <body>
	<div style="background-color: rgb(51, 51, 51);">
            <h1>Create Data</h1>
        </div>
	<?php
		

		//Arrays (not all are needed)
		$cities = array();
		$domains = array();
		$firstNames = array();
		$lastNames = array();
		$products = array();
		$states = array();
		$streetNames = array();
		$streetTypes = array();

		//Files & storing
		$citiesFile = fopen("input_homework5/cities.txt","r");
		for($i = 0; $i < 385; $i++){
			$cities[$i] = fgets($citiesFile);
		}
		fclose($citiesFile);
		$cities = implode(",",$cities);
		$cities = explode("\r\n,",$cities);
		//remove \n on the last one
		$cities[count($cities)-1] = str_replace("\r\n","",$cities[count($cities)-1]);

		$domainsFile = fopen("input_homework5/domains.txt","r");
		for($i = 0; $i < 15; $i++){
			$domains[$i] = fgets($domainsFile);
		}
		fclose($domainsFile);
		$domains = implode(",",$domains);
		$domains = explode("\r\n,",$domains);
		//remove \n on the last one
		$domains[count($domains)-1] = str_replace("\r\n","",$domains[count($domains)-1]);
		
		$firstNamesFile = fopen("input_homework5/first_names.txt","r");
		for($i = 0; $i < 25; $i++){
			$firstNames[$i] = fgets($firstNamesFile);
		}
		fclose($firstNamesFile);
		$firstNames = implode(",",$firstNames);
		$firstNames = explode("\r\n,",$firstNames);
		//remove \n on the last one
		$firstNames[count($firstNames)-1] = str_replace("\r\n","",$firstNames[count($firstNames)-1]);

		$lastNamesFile = fopen("input_homework5/last_names.txt","r");
		for($i = 0; $i < 25; $i++){
			$lastNames[$i] = fgets($lastNamesFile);
		}
		fclose($lastNamesFile);
		$lastNames = implode(",",$lastNames);
		$lastNames = explode("\r\n,",$lastNames);
		//remove \n on the last one
		$lastNames[count($lastNames)-1] = str_replace("\r\n","",$lastNames[count($lastNames)-1]);

		$productsFile = fopen("input_homework5/products.txt","r");
		for($i = 0; $i < 1000; $i++){
			$products[$i] = fgets($productsFile);
		}
		fclose($productsFile);
		$products = implode(",",$products);
		$products = explode("\r\n,",$products);
		//remove \n on the last one
		$products[count($products)-1] = str_replace("\r\n","",$products[count($products)-1]);
		$products = implode(",",$products);
		$products = explode("\n,",$products);

		$statesFile = fopen("input_homework5/states.txt","r");
		for($i = 0; $i < 50; $i++){
			$states[$i] = fgets($statesFile);
		}
		fclose($statesFile);
		$states = implode(",",$states);
		$states = explode("\r\n,",$states);
		//remove \n on the last one
		$states[count($states)-1] = str_replace("\r\n","",$states[count($states)-1]);

		$streetNamesFile = fopen("input_homework5/street_names.txt","r");
		for($i = 0; $i < 50; $i++){
			$streetNames[$i] = fgets($streetNamesFile);
		}
		fclose($streetNamesFile);
		$streetNames = implode(",",$streetNames);
		$streetNames = explode("\r\n,",$streetNames);
		//remove \n on the last one
		$streetNames[count($streetNames)-1] = str_replace("\r\n","",$streetNames[count($streetNames)-1]);

		$streetTypesFile = fopen("input_homework5/street_types.txt","r");
		for($i = 0; $i < 10; $i++){
			$streetTypes[$i] = fgets($streetTypesFile);
		}
		fclose($streetTypesFile);
		$streetTypes = implode(",",$streetTypes);
		$streetTypes = explode("\r\n,",$streetTypes);
		//remove \n on the last one
		$streetTypes[count($streetTypes)-1] = str_replace("\r\n","",$streetTypes[count($streetTypes)-1]);

		//Outputs
		
		//address
		for($i = 0; $i < 150; $i++){
			//random values
			$tempAddNum = rand(100,3000);
			$tempStreetN = rand(0, (count($streetNames)-1));
			$tempStreetT = rand(0,9);
			$tempCities = rand(0, (count($cities)-1));
			$tempState = rand(0, (count($states)-1));
			$tempZip = rand(10000,99999);
			
			//variables, for ease
			$address = "$tempAddNum $streetNames[$tempStreetN] $streetTypes[$tempStreetT]";
			$addressId = $i + 1;

			//string (primary keys[first])
			$starterNode = "INSERT INTO superstore.address\n\tVALUES\n\t\t";
			$insertNode = "($addressId,'$address','$cities[$tempCities]','$states[$tempState]',$tempZip),\n\t\t";
			if($addressId == 150)$insertNode = "($addressId,'$address','$cities[$tempCities]','$states[$tempState]',$tempZip);\n";
			print("<p>$insertNode</p>");

			//Print to txt file
			$textFile = fopen("data.sql","a");
			if($i == 0)fputs($textFile, "$starterNode");
			fputs($textFile, "$insertNode");
			fclose($textFile);			
		}
		//customer
		for($i = 0; $i < 100; $i++){
			//random values
			$tempF = rand(0,(count($firstNames)-1));
			$tempL = rand(0,(count($lastNames)-1));
			$tempEmail = rand(0,(count($domains)-1));
			$tempPhone = rand(100,999)."-".rand(100,999)."-".rand(1000,9999);
			
			//variables, for ease
			$email = "$firstNames[$tempF].$lastNames[$tempL]$domains[$tempEmail]";
			$customerId = $i + 1;

			//string (primary[first] and foreign keys[last])
			$starterNode = "INSERT INTO superstore.customer\n\tVALUES\n\t\t";
			$insertNode = "($customerId,'$firstNames[$tempF]','$lastNames[$tempL]','$email','$tempPhone',$customerId),\n\t\t";
			if($customerId == 100)$insertNode = "($customerId,'$firstNames[$tempF]','$lastNames[$tempL]','$email','$tempPhone',$customerId);\n";
			print("<p>$insertNode</p>");

			//Print to txt file
			$textFile = fopen("data.sql","a");
			if($i == 0)fputs($textFile, "$starterNode");
			fputs($textFile, "$insertNode");
			fclose($textFile);			
		}
		//order
		for($i = 0; $i < 350; $i++){
			//random values
			$random = rand(1,100);
			//variables, for ease
			$orderId = $i + 1;

			//string (primary[first] and foreign keys only[last 2])
			$starterNode = "INSERT INTO superstore.`order`\n\tVALUES\n\t\t";
			$insertNode = "($orderId,$random,$random),\n\t\t";
			if($orderId == 350)$insertNode = "($orderId,$random,$random);\n";
			print("<p>$insertNode</p>");

			//Print to txt file
			$textFile = fopen("data.sql","a");
			if($i == 0)fputs($textFile, "$starterNode");
			fputs($textFile, "$insertNode");
			fclose($textFile);			

			//remove first name from list (NO NEED FOR HW5)
			//array_splice($firstNames,$tempF, 1);
			//array_splice($lastNames,$tempL, 1);
			//array_splice($streetNames,$tempStreetN, 1);
		}
		//product
		for($i = 0; $i < 750; $i++){
			//random values
			$tempProducts = rand(0,(count($products)-1));
			$tempProductDesc = "A wonder $products[$tempProducts] for you to enjoy.";
			$tempWeight = rand(1,50);
			$tempCost = rand(1,500);
			
			//variables, for ease
			$productId = $i + 1; 

			//string (primary key[first])
			$starterNode = "INSERT INTO superstore.product\n\tVALUES\n\t\t";
			$insertNode = "($productId,'$products[$tempProducts]','$tempProductDesc',$tempWeight,$tempCost),\n\t\t";
			if($productId == 750)$insertNode = "($productId,'$products[$tempProducts]','$tempProductDesc',$tempWeight,$tempCost);\n";
			print("<p>$insertNode</p>");

			//Print to txt file
			$textFile = fopen("data.sql","a");
			if($i == 0)fputs($textFile, "$starterNode");
			fputs($textFile, "$insertNode");
			fclose($textFile);			

			//remove first name from list (NO NEED FOR HW5)
			//array_splice($firstNames,$tempF, 1);
			//array_splice($lastNames,$tempL, 1);
			//array_splice($streetNames,$tempStreetN, 1);
		}
		//warehouse
		for($i = 0; $i < 25; $i++){
			//random values
			$addressId = rand(100,150);
			$tempName = rand(0, count($cities)-1);

			//variables, for ease
			$warehouseId = $i + 1;

			$starterNode = "INSERT INTO superstore.warehouse\n\tVALUES\n\t\t";
			$insertNode = "($warehouseId,'$cities[$tempName] Warehouse',$addressId),\n\t\t";
			if($warehouseId == 25)$insertNode = "($warehouseId,'$cities[$tempName] Warehouse',$addressId);\n";
			print("<p>$insertNode</p>");

			//Print to txt file
			$textFile = fopen("data.sql","a");
			if($i == 0)fputs($textFile, "$starterNode");
			fputs($textFile, "$insertNode");
			fclose($textFile);			

			//remove first name from list (NO NEED FOR HW5)
			//array_splice($firstNames,$tempF, 1);
			//array_splice($lastNames,$tempL, 1);
			//array_splice($streetNames,$tempStreetN, 1);
		}
		//order_item
		for($i = 0; $i < 550; $i++){
			//random values
			$orderId = rand(1,350);
			$productId = rand(1,750);
			$tempQuantity = rand(1,1000);
			$tempPrice = rand(1,2500);
			
			//variables, for ease
			$starterNode = "INSERT INTO superstore.order_item\n\tVALUES\n\t\t";
			$insertNode = "($orderId,$productId,$tempQuantity,$tempPrice),\n\t\t";
			if($i == 549)$insertNode = "($orderId,$productId,$tempQuantity,$tempPrice);\n";
			print("<p>$insertNode</p>");

			//Print to txt file
			$textFile = fopen("data.sql","a");
			if($i == 0)fputs($textFile, "$starterNode");
			fputs($textFile, "$insertNode");
			fclose($textFile);			

			//remove first name from list (NO NEED FOR HW5)
			//array_splice($firstNames,$tempF, 1);
			//array_splice($lastNames,$tempL, 1);
			//array_splice($streetNames,$tempStreetN, 1);
		}
		//product_warehouse
		for($i = 0; $i < 1250; $i++){
			//random values
			$productId = rand(1,750);
			$warehouseId = rand(1,25);

			//variables, for ease
			$starterNode = "INSERT INTO superstore.product_warehouse\n\tVALUES\n\t\t";
			$insertNode = "($productId,$warehouseId),\n\t\t";
			if($i == 1249)$insertNode = "($productId,$warehouseId);\n";
			print("<p>$insertNode</p>");

			//Print to txt file
			$textFile = fopen("data.sql","a");
			if($i == 0)fputs($textFile, "$starterNode");
			fputs($textFile, "$insertNode");
			fclose($textFile);			

			//remove first name from list (NO NEED FOR HW5)
			//array_splice($firstNames,$tempF, 1);
			//array_splice($lastNames,$tempL, 1);
			//array_splice($streetNames,$tempStreetN, 1);
		}

	?>
	<!--reference back to initial html page-->
	<a href="html.html" title="Initializer" alt="Initializer">Click here to return</a>
    </body>