package org.mpei.WorkSololearn_6.Practic_3;

public class Main {
    /**
     * Полиморфизм
     * Транспортные средства можно разделить на классы, в зависимости от типа потребляемой энергии.
     * Вам дана программа, определяющая 3 класса транспортных средств: Vehicle, ElectricVehicle и HybridVehicle.
     * ElectricVehicle и HybridVehicle унаследованы от класса Vehicle.
     * Завершите программу, повторно реализировав метод resource() в унаследованных классах, чтобы существующие вызовы работали верно.
     *
     * Подкласс может реализовать метод родительского класса на основе собственных требований.
     * */
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        Vehicle electric = new ElectricVehicle();
        Vehicle hybrid = new HybridVehicle();

        //вызовы
        vehicle.start();
        vehicle.resource();
        electric.start();
        electric.resource();
        hybrid.start();
        hybrid.resource();
    }
}
