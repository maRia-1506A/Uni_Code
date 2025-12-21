<?php
interface Notifier
{
    public function sendNotification($message, $recipient);
}

class EmailNotifier implements Notifier
{
    public function sendNotification($message, $recipient)
    {
        echo "Email sent to $recipient: $message<br>";
    }
}

class SMSNotifier implements Notifier
{
    public function sendNotification($message, $recipient)
    {
        echo "SMS sent to $recipient: $message<br>";
    }
}

class PushNotifier implements Notifier
{
    public function sendNotification($message, $recipient)
    {
        echo "Push notification sent to $recipient: $message<br>";
    }
}

$email = new EmailNotifier();
$email->sendNotification("Hello", "user@email.com");

$sms = new SMSNotifier();
$sms->sendNotification("Hello", "017XXXXXXXX");

$push = new PushNotifier();
$push->sendNotification("Hello", "DeviceID");
?>