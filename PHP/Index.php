<?php
    require_once('Car.php');
    require_once('Account.php');

    $car1 = new Car("kbm123", new Account("Katherine Benjumea","12345678"));
    $car1->printDataCar();

    $car2 = new Car("AMD125", new Account("Tifa Gutierrez"."451265"));
    $car2->printDataCar():

?>
