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
            <h1>Array Displayer</h1>
        </div>
	<?php
		//Inputs
		$arrayRow = intval($_POST["arrayRow"]);
		$arrayColumn = intval($_POST["arrayColumn"]);
		$minRandom = intval($_POST["minRandom"]);
		$maxRandom = intval($_POST["maxRandom"]);

		//Create a [row][column] array
		$arrayHolder = array();
		for($i = 0; $i < $arrayRow; $i++){
			$arrayHolder[$i] = array(); //row

			//Fill in each with a random number between min/max
			for($v = 0; $v < $arrayColumn; $v++){
				$arrayHolder[$i][$v] = rand($minRandom, $maxRandom); //column
			}
		}
		
		//Outputs
			//Display inputs
		print("<p>Array: $arrayRow X $arrayColumn, 
			Min: $minRandom, Max: $maxRandom</p>
		");
			//Print array as a table
		print("<table>\n");
		for($i = 0; $i < $arrayRow; $i++){
			print("\t\t\t<tr>\n");
			for($v = 0; $v < $arrayColumn; $v++){
				print("\t\t\t\t<td>".$arrayHolder[$i][$v]."</td>\n");
			}

			print("\t\t\t</tr>\n");
		}
		print("\t\t</table><p></p>\n");
		
			//Print Row / Sum / Avg / Std Dev table
		print("\n\t\t<table>\n");
		print("\t\t\t<tr>
                <th>Row</th>
                <th>Sum</th>
                <th>Avg</th>
                <th>Std Dev</th>
            </tr>\n");
		for($i = 0; $i < $arrayRow; $i++){
			//print i, sum of column, avg of column, std of column for each
			print("\t\t\t<tr>\n");
			print("\t\t\t\t<td>".$i."</td>\n");
			$sum = 0;
			$avg = 0;
			$stddev = 0;
			for($v = 0; $v < $arrayColumn; $v++){
				$sum += $arrayHolder[$i][$v];
			}
			$avg = $sum / count($arrayHolder[$i]);
			for($v = 0; $v < $arrayColumn; $v++){
				$stddev += pow(($arrayHolder[$i][$v] - $avg),2);
			}
			$stddev = sqrt($stddev / count($arrayHolder[$i]));
			
			print("\t\t\t\t<td>".$sum."</td>\n");
			print("\t\t\t\t<td>".number_format($avg,3)."</td>\n");
			print("\t\t\t\t<td>".number_format($stddev,3)."</td>\n");
			print("\t\t\t</tr>\n");
		}
		print("\t\t</table><p></p>\n\n");

			//Print table but 2x rows with it saying pos/neg in between for above
		print("\t\t<table>\n");
		for($i = 0; $i < $arrayRow; $i++){
			print("\t\t\t<tr>\n");
			for($v = 0; $v < $arrayColumn; $v++){
				print("\t\t\t\t<td>".$arrayHolder[$i][$v]."</td>\n");
			}
			print("\t\t\t</tr>\n");
			print("\t\t\t<tr>\n");
			for($v = 0; $v < $arrayColumn; $v++){
				$sign;
				if($arrayHolder[$i][$v] > 0){
					$sign = "positive";
				}
				elseif($arrayHolder[$i][$v] == 0){
					$sign = "zero";
				}
				else{
					$sign = "negative";
				}
				print("\t\t\t\t<td>".$sign."</td>\n");
			}
			print("\t\t\t</tr>\n");
		}
		print("\t\t</table><p></p>\n\t");
	?>
	<!--reference back to initial html page-->
	<a href="html.html" title="Array Builder" alt="Array Builder">Click here to return</a>
    </body>