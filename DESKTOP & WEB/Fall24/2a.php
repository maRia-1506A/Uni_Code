<?php
function majorityElement($nums) {
    $count= array_count_values($nums); //Counts how many times each number appears in the array
    $n= count($nums); //Stores the total number of elements in the array

    foreach($count as  $num=>$freq) {
        if($freq> $n/2) {
            return $num;
        }
    }
}

echo majorityElement([3,2,3]);      
echo "<br>";
echo majorityElement([2,2,1,1,1,2,2]);

?>