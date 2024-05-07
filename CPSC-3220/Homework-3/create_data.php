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
		$domains;
		$firstNames;
		$lastNames = array();
		$streetNames = array();
		$streetTypes;

		//Files & storing
		$domainsFile = fopen("hw3_data/domains.txt","r");
		$domains = fgets($domainsFile);
		fclose($domainsFile);
		$domains = explode(".", $domains);
		//remove \n on the last one
		$domains[count($domains)-1] = str_replace("\r\n","",$domains[count($domains)-1]);
		
		$firstNamesFile = fopen("hw3_data/first_names.csv","r");
		$firstNames = fgetcsv($firstNamesFile, 1024, ",");
		fclose($firstNamesFile);

		$lastNamesFile = fopen("hw3_data/last_names.txt","r");
		for($i = 0; $i < 25; $i++){
			$lastNames[$i] = fgets($lastNamesFile);
		}
		fclose($lastNamesFile);
		$lastNames = implode(",",$lastNames);
		$lastNames = explode("\r\n,",$lastNames);
		//remove \n on the last one
		$lastNames[count($lastNames)-1] = str_replace("\r\n","",$lastNames[count($lastNames)-1]);

		$streetNamesFile = fopen("hw3_data/street_names.txt","r");;
		for($i = 0; $i < 6; $i++){
			$streetNames[$i] = fgets($streetNamesFile);
		}
		fclose($streetNamesFile);
		$streetNames = implode(":",$streetNames);
		$streetNames = explode("\r\n:",$streetNames);
		$streetNames = implode(":",$streetNames);
		$streetNames = explode(":",$streetNames);
		//remove \n on the last one
		$streetNames[count($streetNames)-1] = str_replace("\r\n","",$streetNames[count($streetNames)-1]);

		$streetTypesFile = fopen("hw3_data/street_types.txt","r");;
		$streetTypes = fgets($streetTypesFile);
		fclose($streetTypesFile);
		$streetTypes = explode("..;", $streetTypes);
		//remove \n on the last one		
		$streetTypes[count($streetTypes)-1] = str_replace("\r\n","",$streetTypes[count($streetTypes)-1]);

		//Outputs
			//Prints arrays
		print("<pre>");
		print("\n\t<span><b>Domains </b></span>");
		print_r($domains);
		print("\n\t<span><b>First Names </b></span>");
		print_r($firstNames);
		print("\n\t<span><b>Last Names </b></span>");
		print_r($lastNames);
		print("\n\t<span><b>Street Names </b></span>");
		print_r($streetNames);
		print("\n\t<span><b>Street Types </b></span>");
		print_r($streetTypes);
		print("\t</pre>");

			//Print table 4x25 of random and unique ones
		print("\n\t<table>\n");
		print("\t\t<tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Address</th>
            <th>Email</th>
        </tr>\n");
		
		for($i = 0; $i < 25; $i++){
			//random values
			$tempF = rand(0,(count($firstNames)-1));
			$tempL = rand(0,(count($lastNames)-1));
			$tempAddNum = rand(100,3000);
			$tempStreetN = rand(0, (count($streetNames)-1));
			$tempStreetT = rand(0,9);
			$tempEmail = 2*rand(0,7);
			$tempEnder = $tempEmail + 1;
			
			//variables, for ease
			$address = "$tempAddNum $streetNames[$tempStreetN] $streetTypes[$tempStreetT]";
			$email = "$firstNames[$tempF].$lastNames[$tempL]@$domains[$tempEmail].$domains[$tempEnder]";
			//table
			print("\t\t<tr>\n");
			print("\t\t\t<td>".$firstNames[$tempF]."</td>\n");
			print("\t\t\t<td>".$lastNames[$tempL]."</td>\n");
			print("\t\t\t<td>$address</td>\n");
			print("\t\t\t<td>$email</td>\n");
			
			//Print to txt file
			$textFile = fopen("txt.txt","a");
			fputs($textFile, "$firstNames[$tempF]:$lastNames[$tempL]:$address:$email\n");
			fclose($textFile);			

			//remove first name from list
			array_splice($firstNames,$tempF, 1);
			array_splice($lastNames,$tempL, 1);
			array_splice($streetNames,$tempStreetN, 1);
		}
		
		print("\t</table>\n<p></p>");
	?>
	<!--reference back to initial html page-->
	<a href="html.html" title="Initializer" alt="Initializer">Click here to return</a>
    </body>