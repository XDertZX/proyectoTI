
-- Inserts categoría
INSERT INTO categoria VALUES(1, 'Todo tipo de pianos', 'Piano');
INSERT INTO categoria VALUES(2, 'Todo tipo de guitarras', 'Guitarra');
INSERT INTO categoria VALUES(3, 'Todo tipo de baterías', 'Batería');
INSERT INTO categoria VALUES(4, 'Todo tipo de instrumentos de Viento', 'Viento');
INSERT INTO categoria VALUES(5, 'Todo tipo de accesorios', 'Accesorios');

-- Inserts cliente
INSERT INTO cliente VALUES(1, 'torressergio@gmail.com', 'Sergio Torres', '22.372.682-8', '+56912345678');
INSERT INTO cliente VALUES(2, 'severinoeduardo@gmail.com', 'Eduardo Severino', '21.123.456.7', '+56923456789');
INSERT INTO cliente VALUES(3, 'santiagobenjamin@gmail.com', 'Benjamin Santiago', '13.345.678-k', '+56934567890');
INSERT INTO cliente VALUES(4, 'reyesluis@gmail.com', 'Luis Reyes','26.456.789-0', '+56909876543');
INSERT INTO cliente VALUES(5, 'arenillasmauro@gmail.com', 'Mauro Arenillas','20.278.965-3', '+56912457890');
INSERT INTO cliente VALUES(6, 'arevalorenato@gmail.com', 'Renato Arevalo', '21.783.945-5', '+56956734589');

-- Inserts comuna
INSERT INTO comuna VALUES(1, 'Cerrillos');
INSERT INTO comuna VALUES(2, 'Las Condes');
INSERT INTO comuna VALUES(3, 'Maipú');
INSERT INTO comuna VALUES(4, 'La Pintana');
INSERT INTO comuna VALUES(5, 'Alto Hospicio');

-- Inserts region
INSERT INTO region VALUES(1, 'Metropolitana');
INSERT INTO region VALUES(2, 'Iquique');

-- Inserts Sucursal
INSERT INTO sucursal VALUES(1, 'Lo Espejo', '18732', 1, 1);
INSERT INTO sucursal VALUES(2, 'El Rosal', '0673', 1, 2);
INSERT INTO sucursal VALUES(3, 'Av. Arturo Prat', '4834', 2, 1);

-- Inserts tipo_empleado
INSERT INTO tipo_empleado VALUES(1, 'Recepcionista', 659873,'Full Time');
INSERT INTO tipo_empleado VALUES(2, 'Vendedor', 354067, 'Part Time');
INSERT INTO tipo_empleado VALUES(3, 'Manager', 982634, 'Full Time');

-- Inserts empleado
INSERT INTO empleado VALUES(1, '2008-05-18', 'Diego Bustamantes', 'Recepcionista', '17.679.691-k', 1, 1);
INSERT INTO empleado VALUES(2, '2010-11-04', 'Bastian Zuñiga', 'Vendedor', '19.123,456-1', 1, 2);
INSERT INTO empleado VALUES(3, '2015-01-15', 'Jose Martinez', 'Recepcionista', '20.987.678-5', 1, 1);
INSERT INTO empleado VALUES(4, '2004-08-21', 'Gabriela Fuentes', 'Recepcionista', '13.896.253-9', 2, 1);
INSERT INTO empleado VALUES(5, '2009-10-12', 'Daniel Cifuentes', 'Vendedor', '15.753.973-2', 2, 2);
INSERT INTO empleado VALUES(6, '2007-09-29', 'Catalina Rosas', 'Recepcionista', '18.538.783-k', 2, 1);
INSERT INTO empleado VALUES(7, '2004-02-01', 'Nelson Contreras', 'Manager', '13.763.602-7', 3, 3);
INSERT INTO empleado VALUES(8, '2007-09-29', 'Gabriel Galvez', 'Vendedor', '18.648.833-9', 3, 2);
INSERT INTO empleado VALUES(9, '2005-12-15', 'Tomas Contreras', 'Recepcionista', '13.867.973-5', 1, 1);
INSERT INTO empleado VALUES(10,'2010-04-26', 'Kidd Voodoo', 'Manager', '19.634.038-1', 2, 3);

-- Inserts marca
INSERT INTO marca VALUES(1, 'Fender');
INSERT INTO marca VALUES(2, 'Yamaha');
INSERT INTO marca VALUES(3, 'Gibson');
INSERT INTO marca VALUES(4, 'Rolan');

-- Inserts producto
INSERT INTO producto VALUES(1, 'Guitarra ElectroAcustica con doble pastilla', 'Guitarra ElectroAcustica Gibson', 89990, 2, 3);
INSERT INTO producto VALUES(2, 'Guitarra clasica acustica de 6 cuerdas', 'Guitarra Acusitca Gibson', 149990, 2, 3);
INSERT INTO producto VALUES(3, 'Piano de cola GB1K', 'Piano de cola Yamaha', 1299990, 1, 2);
INSERT INTO producto VALUES(4, 'Piano digital 61 teclas', 'Piano Digital Yamaha', 159990, 1, 2);
INSERT INTO producto VALUES(5, 'Batería con tres platillos', 'Batería Fender', 199990, 3, 1);
INSERT INTO producto VALUES(6, 'Batería de doble pedal', 'Guitarra ElectroAcustica Fender', 259990, 3, 1);
INSERT INTO producto VALUES(7, 'Trompeta de 3 gatillos', 'Trompeta Yamaha', 79990, 4, 2);
INSERT INTO producto VALUES(8, 'Harmonica ElectroAcustica con doble pastilla', 'Harmonica Yamaha', 19990, 4, 2);
INSERT INTO producto VALUES(9, 'Correa para guitarra, piano o batería', 'Correa para instrumentos', 5990, 5, 3);
INSERT INTO producto VALUES(10, 'Palillos de madera para batería', 'Palillos de batería', 7990, 5, 3);

-- Inserts venta
INSERT INTO venta VALUES(1, '2013-05-29', 239979, 1, 10);
INSERT INTO venta VALUES(2, '2017-04-19', 1299990, 4, 2);
INSERT INTO venta VALUES(3, '2015-04-19', 5990, 3, 7);
INSERT INTO venta VALUES(4, '2014-04-19', 149990, 4, 8);

-- Inserts detalle_venta
INSERT INTO detalle_venta VALUES(1, 3, 79990, 7, 1);
INSERT INTO detalle_venta VALUES(2, 1, 1299990, 4, 2);
INSERT INTO detalle_venta VALUES(3, 3, 79990, 3, 3);
INSERT INTO detalle_venta VALUES(4, 3, 79990, 2, 4);
