-- joins

 
-- joins implicitos

select * from tiendaenlinea.producto pro, tiendaenlinea.pedido pe, tiendaenlinea.item itm
where pe.Factura_idFactura=itm.Pedido_Factura_idFactura and itm.Producto_idProducto=pro.idProducto;
-- joins explisitos 
select * from tiendaenlinea.producto pro inner join  tiendaenlinea.pedido ped inner join tiendaenlinea.item item
on ped.Factura_idFactura=item.Pedido_Factura_idFactura and item.Producto_idProducto=pro.idProducto;


select * from tiendaenlinea.domicilio_cuenta cu left outer join tiendaenlinea.municipio mun on  mun.idMunicipio;

-- ejercicio1
-- explisito
select item.Cantidad, pro.Nombre, item.costoUnitario, item.costoTotal from tiendaenlinea.producto pro inner join  tiendaenlinea.item item inner join tiendaenlinea.pedido ped inner join tiendaenlinea.factura fac
on  pro.idProducto=item.Producto_idProducto and ped.Factura_idFactura=item.Pedido_Factura_idFactura and fac.idFactura=item.Pedido_Factura_idFactura where fac.idFactura=1;

-- implisito

select item.Cantidad, pro.Nombre, item.CostoUnitario, item.CostoTotal from tiendaenlinea.producto pro, tiendaenlinea.item item, tiendaenlinea.pedido ped, tiendaenlinea.factura fac
where  pro.idProducto=item.Producto_idProducto and ped.Factura_idFactura=item.Pedido_Factura_idFactura and fac.idFactura=item.Pedido_Factura_idFactura and fac.idFactura=1;


-- ejercicio2

-- explisito
select cu.PrimerNombre, dom.Direccion, dom.Telefono, mun.nombre, fac.idFactura from tiendaenlinea.factura fac inner join tiendaenlinea.cuenta cu inner join tiendaenlinea.domicilio_cuenta dom inner join tiendaenlinea.municipio mun
on fac.Cuenta_numeroDocumento=cu.numeroDocumento and fac.Cuenta_tipoDocumento=cu.tipoDocumento and cu.numeroDocumento=dom.Cuenta_numeroDocumento and cu.tipoDocumento=dom.Cuenta_tipoDocumento and dom.Municipio_idMunicipio=mun.idMunicipio and fac.idFactura=1 ;

-- implisito

select cu.PrimerNombre, dom.Direccion, dom.Telefono, mun.nombre, fac.idFactura from tiendaenlinea.factura fac, tiendaenlinea.cuenta cu, tiendaenlinea.domicilio_cuenta dom, tiendaenlinea.municipio mun
where fac.Cuenta_numeroDocumento=cu.numeroDocumento and fac.Cuenta_tipoDocumento=cu.tipoDocumento and cu.numeroDocumento=dom.Cuenta_numeroDocumento and cu.tipoDocumento=dom.Cuenta_tipoDocumento and dom.Municipio_idMunicipio=mun.idMunicipio and fac.idFactura=1 ;

-- ejercicio 3

-- explisito

select cu.PrimerNombre, fac.idFactura, ped.subtotal, ped.total from tiendaenlinea.cuenta cu inner join tiendaenlinea.factura fac inner join tiendaenlinea.pedido ped
on cu.TipoDocumento=fac.Cuenta_tipoDocumento and cu.numeroDocumento=fac.Cuenta_numeroDocumento and fac.idFactura=ped.Factura_idFactura where fac.idFactura=1;

-- implisito
select cu.PrimerNombre, fac.idFactura, ped.subtotal, ped.total from tiendaenlinea.cuenta cu , tiendaenlinea.factura fac, tiendaenlinea.pedido ped
where cu.tipoDocumento=fac.Cuenta_tipoDocumento and cu.numeroDocumento=fac.Cuenta_numeroDocumento and fac.idFactura=ped.Factura_idFactura and fac.idFactura=1;


-- ejercicio4
-- explisito
select cu.PrimerNombre,fac.idFactura,pe.subtotal,pe.Total, pa.tipoTransaccion from tiendaenlinea.cuenta cu inner join tiendaenlinea.factura fac inner join tiendaenlinea.pago pa inner join tiendaenlinea.pedido pe
on cu.tipoDocumento=fac.Cuenta_tipoDocumento and cu.numeroDocumento=fac.Cuenta_numeroDocumento and fac.idFactura=pa.Factura_idFactura and fac.idFactura=pe.Factura_idFactura where fac.idFactura=1;

-- implisito
select cu.primerNombre,fac.idFactura,pe.subtotal,pe.total,pa.tipoTransaccion from tiendaenlinea.cuenta cu , tiendaenlinea.factura fac , tiendaenlinea.pago pa , tiendaenlinea.pedido pe
where cu.tipoDocumento=fac.Cuenta_tipoDocumento and cu.numeroDocumento=fac.Cuenta_tipoDocumento and fac.idFactura=pa.Factura_idFactura and fac.idFactura=pe.Factura_idFactura and fac.idFactura=1;

