select * from tiendaenlinea.producto a where a.nombre like '%g';
-- poner un alias
select a.cantidad as cantidad from tiendaenlinea.item a where a.costoTotal;
-- cambiar el nombre a 10 productos

UPDATE `tiendaenlinea`.`producto`
 SET `idProducto`='Ahi01' WHERE `idProducto`='120456';

UPDATE `tiendaenlinea`.`producto`
 SET `idProducto`='Ahiop02' WHERE `idProducto`='A0002';

UPDATE `tiendaenlinea`.`producto`
 SET `idProducto`='Ahi03' WHERE `idProducto`='A0003';

UPDATE `tiendaenlinea`.`producto`
 SET `idProducto`='A0004' WHERE `idProducto`='Ahi04';

UPDATE `tiendaenlinea`.`producto`
 SET `idProducto`='A0005' WHERE `idProducto`='Ahi05';

UPDATE `tiendaenlinea`.`producto`
 SET `idProducto`='A0006' WHERE `idProducto`='Ahi06';

UPDATE `tiendaenlinea`.`producto`
 SET `idProducto`='E0007' WHERE `idProducto`='Ahi07';

UPDATE `tiendaenlinea`.`producto`
 SET `idProducto`='E0008' WHERE `idProducto`='Ahi08';

UPDATE `tiendaenlinea`.`producto`
 SET `idProducto`='E0009' WHERE `idProducto`='Ahi09';

UPDATE `tiendaenlinea`.`producto`
 SET `idProducto`='E0010' WHERE `idProducto`='Ahi010';

-- actualizacion de total y subtotal

UPDATE `tiendaenlinea`.`pedido`
SET
`total` = (select sum(a.CostoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=1)*1.16,
`subtotal` = (select sum(a.CostoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=1),
`impuestos` = (select sum(a.CostoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=1)*0.16
WHERE `Factura_idFactura` = 1;

UPDATE `tiendaenlinea`.`pedido`
SET
`total` = (select sum(a.CostoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=2)*1.16,
`subtotal` = (select sum(a.CostoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=2),
`impuestos` = (select sum(a.CostoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=2)*0.16
WHERE `Factura_idFactura` = 2;

UPDATE `tiendaenlinea`.`pedido`
SET
`total` = (select sum(a.CostoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=3)*1.16,
`subtotal` = (select sum(a.CostoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=3),
`impuestos` = (select sum(a.CostoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=3)*0.16
WHERE `Factura_idFactura` = 3;

UPDATE `tiendaenlinea`.`pedido`
SET
`total` = (select sum(a.CostoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=4)*1.16,
`subtotal` = (select sum(a.CostoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=4),
`impuestos` = (select sum(a.CostoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=4)*0.16
WHERE `Factura_idFactura` = 4;

UPDATE `tiendaenlinea`.`pedido`
SET
`total` = (select sum(a.CostoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=5)*1.16,
`subtotal` = (select sum(a.CostoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=5),
`impuestos` = (select sum(a.CostoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=5)*0.16
WHERE `Factura_idFactura` = 5;

UPDATE `tiendaenlinea`.`pedido`
SET
`total` = (select sum(a.CostoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=6)*1.16,
`subtotal` = (select sum(a.CostoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=6),
`impuestos` = (select sum(a.CostoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=6)*0.16
WHERE `Factura_idFactura` = 6;

UPDATE `tiendaenlinea`.`pedido`
SET
`total` = (select sum(a.CostoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=7)*1.16,
`subtotal` = (select sum(a.CostoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=7),
`impuestos` = (select sum(a.CostoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=7)*0.16
WHERE `Factura_idFactura` = 7;

UPDATE `tiendaenlinea`.`pedido`
SET
`total` = (select sum(a.CostoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=8)*1.16,
`subtotal` = (select sum(a.CostoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=8),
`impuestos` = (select sum(a.CostoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=8)*0.16
WHERE `Factura_idFactura` = 8;

UPDATE `tiendaenlinea`.`pedido`
SET
`total` = (select sum(a.costoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=9)*1.16,
`subtotal` =  (select sum(a.costoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=9),
`impuestos` = (select sum(a.costoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=9)*0.16
WHERE `Factura_idFactura` = 9;

UPDATE `tiendaenlinea`.`pedido`
SET
`total` = (select sum(a.costoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=10)*1.16,
`subtotal` =  (select sum(a.costoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=10),
`impuestos` = (select sum(a.costoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=10)*0.16
WHERE `Factura_idFactura` = 10;

UPDATE `tiendaenlinea`.`pedido`
SET
`total` = (select sum(a.CostoTotal) 
from tiendaenlinea.item a 
where a.Pedido_Factura_idFactura=10)*1.16,

`subtotal` = (select sum(a.CostoTotal) 
from tiendaenlinea.item a 
where a.Pedido_Factura_idFactura=10),

`impuestos` = (select sum(a.CostoTotal) 
from tiendaenlinea.item a 
where a.Pedido_Factura_idFactura=10)*0.16
WHERE `Factura_idFactura` = 10;



select count(*)  from tiendaenlinea.item t where t.Pedido_Factura_idFactura=1;

select sum(a.costoTotal) from tiendaenlinea.item a where a.Pedido_Factura_idFactura=1;


-- cuenta actualizar
UPDATE `tiendaenlinea`.`cuenta` 
SET  `tipoDocumento`= 'Cedula',`numeroDocumento`='1023006468' 
WHERE `tipoDocumento`='CC' and`numeroDocumento`='1008273458';

UPDATE `tiendaenlinea`.`cuenta` 
SET  `tipoDocumento`= 'Cedula',`numeroDocumento`='1023008456' 
WHERE `tipoDocumento`='TI' and`numeroDocumento`='9704040087';

-- cambiar el nombre a dos municipio
UPDATE `tiendaenlinea`.`municipio` 
SET `idMunicipio`='10as' WHERE `idMunicipio`='10';

update `tiendaenlinea`.`Municipio`
set `idMunicipio` = '1450' where `idMunicipio` = '1';

-- cambiar tres productos
UPDATE `tiendaenlinea`.`producto` p
SET
p.Nombre = 'Guitarra de Billie'
WHERE p.idProducto ='A0004';

UPDATE `tiendaenlinea`.`producto` jp
SET
jp.Nombre = 'Guitarra de gerard way'
WHERE jp.idProducto ='A0005';

UPDATE `tiendaenlinea`.`producto` iop
SET
iop.Nombre = 'Guitarra de Frank '
WHERE iop.idProducto ='Ahi02';

-- cambiar nombre de tres personas en la cuenta 

UPDATE `tiendaenlinea`.`cuenta` bu
SET
bu.primerNombre = 'Juan',
bu.segundoNombre ='David',
bu.primerApellido='Gonzales',
bu.segundoApellido='Rubiano'
WHERE bu.tipoDocumento = 'TI' and bu.numeroDocumento='2025412478';

UPDATE `tiendaenlinea`.`cuenta` bu
SET
bu.primerNombre = 'Maria',
bu.segundoNombre ='Fernanda',
bu.primerApellido='Mosquera',
bu.segundoApellido='Herrera'
WHERE bu.tipoDocumento = 'Cedula' and bu.numeroDocumento='1023008456';

UPDATE `tiendaenlinea`.`cuenta` bu
SET
bu.primerNombre = 'Dilana',
bu.segundoNombre ='Sofia',
bu.primerApellido='Carrion',
bu.segundoApellido='Luengas'
WHERE bu.tipoDocumento = 'Cedula' and bu.numeroDocumento='1023006468';

-- joins
-- sirve para mostrar de las dos tablas una a la derecha o de la izquierdas y la otra tabla que no se muestra nula 
select * from tiendaenlinea.cuenta left join 
tiendaenlinea.producto  on producto.idProducto = cuenta.primerNombre;
-- muestra la tabla a la derecha
select * from tiendaenlinea.cuenta right outer join 
tiendaenlinea.producto  on producto.idProducto = cuenta.primerNombre;

select cata.idCatalogo, cate.idCategoria, pro.idProducto, it.item from tiendaenlinea.producto pro, tiendaenlinea.catalogo cata, tiendaenlinea.categoria cate, tiendaenlinea.item it
where pro.idProducto=cate.idCategoria and pro.Catalogo_idCatalogo=cata.idCatalogo;


