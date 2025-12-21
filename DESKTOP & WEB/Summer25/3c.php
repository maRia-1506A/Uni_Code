<!-- connect to database   -->
<?php
$host='localhost';
$user='root';
$password='';
$database='student_db';

$connection= new mysqli($host, $user, $password, $database);

if($connection->connect_error) {
    die("Connection failed: ".$connection->connect_error);
}
?>

<!-- create/insert  -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form method="post">
        Name: <input type="text" name="name"><br><br>
        Roll Number: <input type="text" name="roll"><br><br>
        Department: <input type="text" name="dept"><br><br>
        <button type="submit">Submit</button>
    </form>
</body>
</html>

<?php
    if($_SERVER['REQUEST_METHOD']=='POST') {
        $name=$_POST['name'];
        $roll=$_POST['roll'];
        $dept= $_POST['dept'];

        $sql= "INSERT INTO students(name, roll, dept) VALUES('$name','$roll', '$dept')";
        if($connection->query($sql)) {
            echo "Successfull";
        } else {
            echo "Error";
        }
        exit;
    }
?>

