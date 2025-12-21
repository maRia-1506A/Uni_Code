<?php
interface Input
{
    public function setNumbers($a, $b);
}

class Addition implements Input
{
    public $n1, $n2;

    public function setNumbers($a, $b)
    {
        $this->n1 = $a;
        $this->n2 = $b;
    }

    public function add()
    {
        return $this->n1 + $this->n2;
    }
}

$obj= new Addition();
$obj->setNumbers(10,20);
echo "Result: ".$obj->add();
?>