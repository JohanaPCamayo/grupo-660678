-- carrito de compras ya
CALL `tiendaenlinea`.`agreCarrito`(
104,
 0,
 0, 
0);

-- producto no me deja la foto
CALL `tiendaenlinea`.`agreProducto`(
'A145',
'Guitarra Electrica ',
'Yamaha',
'Rgx121z', 
'Hecho con 3 piezas de caoba para mayor estabilidad. 3 cuellos pieza puede soportar la prueba del tiempo. Donde los cuellos estándar puede mostrar el envejecimiento de los defectos de los cambios de temperatura y humedad a lo largo de los años, el cuello de 3 piezas', 
'madera de pino',
'roja', -
load_file("Bibliotecas\Imágenes\guitarra-electrica.jpg"),
 12, 
1, 
660.000,
0,
6, 
2
);

-- usuario ya 
CALL `tiendaenlinea`.`agreUsu`(
'452AA',
'greenday45187',
 'Cliente', 
'activo');

-- cuenta ya 
CALL `tiendaenlinea`.`agreCuen`(
'CC',
'1023006489',
'Jeferson',
 'Andres',
 'Jurado',
 'Romero',
 'jefer45218jodjh', 
'jefry@yahoo.es', 
'Nico');

-- factura ya
CALL `tiendaenlinea`.`agreFact`(
12,
'2013-10-04 10:15:15',
0,
'Cedula',
'1023006468'
);

-- pago
CALL `tiendaenlinea`.`agrePago`(
11, 
'9804-3095', 
'Davivienda', 
'Corriente', 
'ATH');

-- pedido ya
CALL `tiendaenlinea`.`agrePedido`(
12, 
0, 
0, 
0);

-- proveedor ya
CALL `tiendaenlinea`.`agreProveedor`(
'452', 
'NIT', 
'Federica', 
'3124579824', 
'feg45@gmail.com');

-- inventario ya
CALL `tiendaenlinea`.`agreInven`(
12, 
'2013-01-24',
 15, 
'A0004', 
'6789', 
'NIT');

-- item ya
CALL `tiendaenlinea`.`agreItem`(
'A0004',
2,
1, 
350000, 
350000);

-- domicilio-cuenta ya
CALL `tiendaenlinea`.`agreDomiCuent`(
'CC', 
'1023006489',
'4527954',
'calle 45 b # 32-45', 
'San Francisco', 
'Ciudad Bolivar', 
'555');

-- domicilio-proveedor ya
 CALL `tiendaenlinea`.`agreDomiProvee`(
'452', 
'NIT', 
'2024578', 
'calle 45 c 45-25 sur', 
'Banrraquillita', 
'Usme',
'524'
);

-- catalogo ya
CALL `tiendaenlinea`.`agreCatal`(
2, 
'Catalogo Music', 
'Este catalogo nos muestra los diferentes diseños de las guitarras y sus innovaciones');

-- categoria ya
CALL `tiendaenlinea`.`agreCateg`(
9, 
'Guitarras innovadoras', 
1, 
3);

