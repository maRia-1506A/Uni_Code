<?php
function findUniqueElement($nums)
{
    // // using built-in func 
    // $counts = array_count_values($nums);

    // foreach ($counts as $number => $freq) {
    //     if($freq==1) {
    //         return $number;
    //     }
    // }

    $count = [];
    foreach ($nums as $numb) {
        if (isset($count[$numb])) {
            $count[$numb]++;
        } else {
            $count[$numb] = 1;
        }
    }

    foreach ($count as $numb => $freq) {
        if ($freq == 1) {
            return $numb;
        }
    }
}

$nums1 = [4, 1, 2, 1, 2];
$nums1 = [2, 2, 3, 3, 5];

echo findUniqueElement($nums1);
echo findUniqueElement($nums2);
?>