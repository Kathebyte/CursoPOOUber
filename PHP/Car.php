<?php

require_once 'Account.php';
class Car{
    public $id;
    public $license;
    public $driver;
    public $passenger;


    public function __construct($license,$driver){
        $this ->_license =$license;
        $this ->_driver = $driver;

    }
    
    public function printDataCar(){
        echo "la license:  $this ->license,driver: 
        {$this ->driver ->name},document:
        {$this ->driver->document}";
    }

}
?>


