<!-- connection  -->
<?php
$host = 'localhost';
$user = 'root';
$password = '';
$database = 'library_db';

$connection = new mysqli($host, $user, $password, $database);

if ($connection->connect_error) {
    die("Connection failed: " . $connection->connect_error);
}
?>

<!-- form -->
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <h2>Add Book Form</h2>
    <form method="post">
        Title: <input type="text" name="title" required><br><br>
        Author: <input type="text" name="author" required><br><br>
        ISBN number: <input type="text" name="isbn" required><br><br>
        <button type="submit">Add</button>
    </form>

</body>

</html>

<!-- create/add -->
<?php
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $title = $_POST['title'];
    $author = $_POST['author'];
    $isbn = $_POST['isbn'];

    $sql = "INSERT INTO books (title, author, isbn) VALUES('$title','$author','$isbn')";
    if ($connection->query($sql)) {
        echo "Success";
    } else {
        echo "error";
    }
}
?>

<!-- delete  -->
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <h2>Delete Book Form</h2>
    <form method="get">
        ISBN number: <input type="text" name="isbn" required><br><br>
        <button type="submit">Delete</button>
    </form>

</body>

</html>

<?php
$isbn = $_GET['isbn'];

$sql= "DELETE FROM books WHERE isbn='$isbn'";
if($connection->query($sql)) {
echo "Book deleted successfully";
} else {
echo "error";
}
?>
