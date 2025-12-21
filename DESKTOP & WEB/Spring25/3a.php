<?php
class Shape
{
    public function calculateArea()
    {
        return 0;
    }
}

class Circle extends Shape
{
    public $radius;
    public function __construct($radius)
    {
        $this->radius = $radius;
    }

    public function calculateArea()
    {
        return pi() * pow($this->radius, 2);
    }

    public function updateRadius($radius)
    {
        $this->radius = $radius;
    }
}

$objCircle = new Circle(5);
$objCircle->updateRadius(10);
echo "The area is: " . $objCircle->calculateArea();
?>