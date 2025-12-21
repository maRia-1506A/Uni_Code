<?php
function averageOfExtremes($arr1, $arr2)
{
    $smallest = $arr1[0];
    foreach ($arr1 as $value1) {
        if ($value1 < $smallest) {
            $smallest = $value1;
        }
    }

    $largest = $arr2[0];
    foreach ($arr2 as $value2) {
        if ($value2 > $largest) {
            $largest = $value2;
        }
    }

    // with built-in function 
    // $smallest= min($arr1);
    // $largest= max($arr2);
    
    $average = ($smallest + $largest) / 2;
    return $average;

}

$arr1 = [4, 1, 2, 1, 2];
$arr2 = [2, 2, 3, 3, 5];

echo averageOfExtremes($arr1, $arr2);
?>