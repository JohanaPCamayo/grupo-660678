-- borrar

drop procedure tiendaenlinea.agrePago;

-- carrito de compras
delimiter /
create procedure tiendaenlinea.agreCarrito(
agregaC int,
subtotal float,
precioTotal float,
impuesto float
)
begin
INSERT INTO `tiendaenlinea`.`carritodecompras`
(`idCarritoDeCompras`,
`subtotal`,
`precioTotal`,
`impuestos`)
VALUES
(agregaC,
subtotal ,
precioTotal,
impuesto
);
end/ 

-- producto

delimiter /
create procedure tiendaenlinea.agreProducto(
aunNum varchar(100),
nombre varchar(300),
marca varchar(45),
referencia varchar (45),
descripcion varchar(500),
material varchar (45),
color varchar(45),
foto longblob,
cantidad int,
activo bool,
precioUnitario float,  
descuento float,
categoria int,
Catalogo int
)
begin
INSERT INTO `tiendaenlinea`.`producto`
(`idProducto`,
`nombre`,
`marca`,
`referencia`,
`descripcion`,
`material`,
`color`,
`foto`,
`cantidad`,
`activo`,
`precioUnitario`,
`descuento`,
`Categoria_idCategoria`,
`Catalogo_idCatalogo`
)  
VALUES
(aunNum,
nombre,
marca,
referencia,
descripcion,
material,
color,
foto,
cantidad ,
activo ,
precioUnitario,
descuento,
categoria,
Catalogo
);
end/

-- usuario
delimiter /
create procedure tiendaenlinea.agreUsu(
usu varchar(20),
contrasena varchar(45),
rl varchar(45),
esta varchar(20)
)
begin
INSERT INTO `tiendaenlinea`.`usuario`
(`idUsuario`,
`contrasena`,
`rol`,
`estado`)
VALUES
(usu,
contrasena,
rl ,
esta
);
end/

-- cuenta
delimiter /
create procedure tiendaenlinea.agreCuen(
tipoDocu varchar(10),
numDocu varchar(45),
priNom varchar(100),
seguNom varchar (45),
priApell varchar (100),
segunApell varchar (45),
contrasena varchar(45),
ema varchar(45),
usua varchar(20)
)
begin
INSERT INTO `tiendaenlinea`.`cuenta`
(`tipoDocumento`,
`numeroDocumento`,
`primerNombre`,
`segundoNombre`,
`primerApellido`,
`segundoApellido`,
`contrasena`,
`email`,
`Usuario_idUsuario`)
VALUES
(tipoDocu,
numDocu,
priNom,
seguNom,
priApell,
segunApell,
contrasena,
ema,
usua 
);
end/

-- factura
delimiter /
create procedure tiendaenlinea.agreFact(
fac int,
fecha DATETIME,
tot float,
cuenTipoDoc varchar(45),
cuenNumDocu varchar(10)
)
begin
INSERT INTO `tiendaenlinea`.`factura`
(`idFactura`,
`fecha`,
`total`,
`Cuenta_tipoDocumento`,
`Cuenta_numeroDocumento`)
VALUES
(fac,
fecha,
tot,
cuenTipoDoc ,
cuenNumDocu
);
end/

-- pago 
delimiter /
create procedure tiendaenlinea.agrePago(
agrFact int,
numTarjet varchar(45),
ban varchar(100),
tipCuenTarje varchar(10),
tipTrans varchar(20)
)
begin
INSERT INTO `tiendaenlinea`.`pago`
(`Factura_idFactura`,
`numTarCredito`,
`banco`,
`tipoCuentaTar`,
`tipoTransaccion`)
VALUES
(agrFact,
numTarjet,
ban ,
tipCuenTarje,
tipTrans
);
end/

-- pedido
delimiter /
create procedure tiendaenlinea.agrePedido(
agrFact int,
tol float,
subt float,
impu float
)
begin
INSERT INTO `tiendaenlinea`.`pedido`
(`Factura_idFactura`,
`total`,
`subtotal`,
`impuestos`)
VALUES
(agrFact,
tol,
subt,
impu
);
end/

-- proveedor
delimiter /
create procedure tiendaenlinea.agreProveedor(
agrProvee varchar(45),
tipIdenti varchar(20),
nom varchar(200),
tel varchar(20),
ema varchar(45)
)
begin
INSERT INTO `tiendaenlinea`.`proveedor`
(`idProveedor`,
`tipoDeIdentificacion`,
`nombre`,
`telefono`,
`email`)
VALUES
(agrProvee,
tipIdenti,
nom,
tel,
ema
);
end/

-- inventario
delimiter /
create procedure tiendaenlinea.agreInven(
ageInve int,
fec DATETIME,
cant int,
proAgrPro varchar(100),
proveAgrProve varchar(45),
proveTipIdent varchar(20)
)
begin
INSERT INTO `tiendaenlinea`.`inventario`
(`idInventario`,
`fecha`,
`cantidad`,
`Producto_idProducto`,
`Proveedor_idProveedor`,
`Proveedor_tipoDeIdentificacion`)
VALUES
(ageInve,
fec,
cant,
proAgrPro,
proveAgrProve,
proveTipIdent
);
end/

-- item 
delimiter /
create procedure tiendaenlinea.agreItem(
agrePro varchar(100),
pediAgrFact int,
canti int,
cosUnit float,
costTol float
)
begin
INSERT INTO `tiendaenlinea`.`item`
(`Producto_idProducto`,
`Pedido_Factura_idFactura`,
`cantidad`,
`costoUnitario`,
`costoTotal`)
VALUES
(agrePro,
pediAgrFact,
canti,
cosUnit,
costTol
);
end/

-- domicilio-cuenta
delimiter /
create procedure tiendaenlinea.agreDomiCuent(
cuenTipDocu varchar(10),
cuenNumDocu varchar(45),
tel varchar(45),
dir varchar(200),
barri varchar(100),
locaa varchar(100),
muniAgreaMunio varchar(20)
)
begin
INSERT INTO `tiendaenlinea`.`domicilio_cuenta`
(`Cuenta_tipoDocumento`,
`Cuenta_numeroDocumento`,
`telefono`,
`direccion`,
`barrio`,
`localidad`,
`Municipio_idMunicipio`)
VALUES
(cuenTipDocu,
cuenNumDocu,
tel,
dir,
barri,
locaa,
muniAgreaMunio
);
end/

-- domicilio-proveedor 
delimiter /
create procedure tiendaenlinea.agreDomiProvee(
provAgreProve varchar(45),
proveeTipIdenti varchar(20),
tel varchar(45),
dire varchar(200),
barr varchar(100),
locaa varchar(100),
munAgreMun varchar(4)
)
begin
INSERT INTO `tiendaenlinea`.`domicilio_proveedor`
(`Proveedor_idProveedor`,
`Proveedor_tipoDeIdentificacion`,
`telefono`,
`direccion`,
`barrio`,
`localidad`,
`Municipio_idMunicipio`)
VALUES
(provAgreProve,
proveeTipIdenti,
tel,
dire,
barr,
locaa,
munAgreMun
);
end/

-- catalogo 
delimiter /
create procedure tiendaenlinea.agreCatal(
agreCatal int,
nomCatal varchar(45),
descri varchar(500)
)
begin
INSERT INTO `tiendaenlinea`.`catalogo`
(`idCatalogo`,
`nombreCatalogo`,
`descripcion`)
VALUES
(agreCatal,
nomCatal,
descri
);
end/

-- categoria
delimiter /
create procedure tiendaenlinea.agreCateg(
agraCatego int,
nomCatego varchar(100),
activa bool,
pariente int
)
begin
INSERT INTO `tiendaenlinea`.`categoria`
(`idCategoria`,
`nombreCategoria`,
`activa`,
`pariente`)
VALUES
(agraCatego,
nomCatego ,
activa,
pariente 
);
end/


