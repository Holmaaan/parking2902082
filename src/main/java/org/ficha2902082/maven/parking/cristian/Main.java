package org.ficha2902082.maven.parking.cristian;

import org.ficha2902082.maven.parking.cristian.entities.Cupo;
import org.ficha2902082.maven.parking.cristian.entities.TipoDocumento;
import org.ficha2902082.maven.parking.cristian.entities.TipoVehiculo;
import org.ficha2902082.maven.parking.cristian.entities.Carro;
import org.ficha2902082.maven.parking.cristian.entities.Cliente;
import org.ficha2902082.maven.parking.cristian.entities.Registro;
import java.util.List;
import java.util.ArrayList;
import java.time.*;

public class Main {
    public static void main(String[] args) {

        //crear dos cupos
        //Instanciar dos cupo:
        Cupo cupito1 = new Cupo();
        cupito1.ancho = 1.0;
        cupito1.largo = 4.5;
        cupito1.letra = 'A';

        Cupo cupito2 = new Cupo('B', 
                                5.0,
                                2.5);
      //intanciar dos carros
      Carro carrito1 = new Carro("ASJ 166", 
                                TipoVehiculo.MOTO);

    Carro carrito2 = new Carro("BSL 002",
                                TipoVehiculo.BUS);



    //Instanciar un cliente:
    Cliente cli = new Cliente("Holman", 
    "Espitia", 
    TipoDocumento.CC, 
    1234567891L, 
    1234567895L);

    //vincular carros al cliente
    cli.addCar(carrito1);
    cli.addCar(carrito2);

    cli.addCar("Ert TYU",
             TipoVehiculo.CAMION);

    //Declarar una lista de Registros
    List<Registro> misRegistro = new ArrayList<>();

    //Instanciar dos Registros E/S
    Registro registro1 = new Registro(
    LocalDate.of(2024, Month.JANUARY, 23),
    LocalTime.of(15, 30, 34),
    LocalDate.of(2024, Month.FEBRUARY, 1),
    LocalTime.of(6, 30, 23),
    50000.00,
    cli.misCarros.get(0),
    cupito1
    );

    Registro registro2 = new Registro(
    LocalDate.of(2024, Month.APRIL, 12),
    LocalTime.of(16, 30, 34),
    LocalDate.of(2022, Month.FEBRUARY, 10),
    LocalTime.of(2, 10, 33),
    60000.00,
    cli.misCarros.get(0),
    cupito2
        


    );
    //vincular los registros a la lista 
    //de registros
    misRegistro.add(registro1);
    misRegistro.add(registro2);

    //recorrer la lista de registros
    for(Registro r : misRegistro){
        System.out.println("Placa:" + 
                         r.carro.placa + "/" +
                         "Cupo:" + 
                         r.cupo.letra + "/" +
                         "Valor:" + 
                         r.valor + "/" +
                         "Fecha Inicio: " +
                         r.fechaInicio.toString() + "/"
        );
    }
 }
}