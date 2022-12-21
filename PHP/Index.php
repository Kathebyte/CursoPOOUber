<?php
    require_once('UberX.php');
    require_once('Account.php');

    $uberX= new UberX("LCS451", new Account("Katherine Benjumea", "1213254"),"Chevrolet","Spark");
    $uberX->printDatacar();
?>
