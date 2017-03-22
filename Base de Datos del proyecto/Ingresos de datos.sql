use bd_biblioteca;


-- inicio ingreso facultad --
insert into t_mae_facultad_bib (nombre_fac) values ('Ingenieria En Sistemas');
insert into t_mae_facultad_bib (nombre_fac) values ('Medicina');
insert into t_mae_facultad_bib (nombre_fac) values ('Ingenieria Industrial');
insert into t_mae_facultad_bib (nombre_fac) values ('Comunicacion');
-- fin ingreso facultad --
select * from t_mae_facultad_bib;
 
 -- inicio ingreso estudiante --
 insert into t_mae_estudiante_bib (cedula_est, nombre_est, telefono_est, direccion_est, semestre_est, T_MAE_FACULTAD_BIB_id_fac, mail_est, clave_est)
 values ('1302373434', 'Anibal San Andres','0995451166', 'Barrio La Dolorosa', '6', 1, 'jaccarrillo@hotmail.com', 'Est1234567');
  
 insert into t_mae_estudiante_bib (cedula_est, nombre_est, telefono_est, direccion_est, semestre_est, T_MAE_FACULTAD_BIB_id_fac, mail_est, clave_est)
 values ('1324256789', 'Galo Aguirre','0995451166', 'Barrio La Aurora', '6', 2, 'jaccarrillo@hotmail.com', 'Est1234567');
 
  insert into t_mae_estudiante_bib (cedula_est, nombre_est, telefono_est, direccion_est, semestre_est, T_MAE_FACULTAD_BIB_id_fac, mail_est, clave_est)
 values ('1308923451', 'Tatiana Aguirre','0995623149', 'Barrio La Paz', '4', 4, 'jaccarrillo@hotmail.com', 'Est1234567');

 insert into t_mae_estudiante_bib (cedula_est, nombre_est, telefono_est, direccion_est, semestre_est, T_MAE_FACULTAD_BIB_id_fac, mail_est, clave_est)
 values ('1376548934', 'Byron Pin','0990123451', 'Barrio Los Esteros', '9', 3, 'jaccarrillo@hotmail.com', 'Est1234567');
 
-- fin ingreso estudiante --
 select  * from t_mae_estudiante_bib;
-- inicio ingreso bibliotecario --

insert into t_mae_bibliotecario_bib (cedula_bib, nombre_bib, telefono_bib, turno_bib, mail_bib, clave_bib) 
values ('1314748136', 'Jefferson Aguirre', '0996451166', 'Matutino', 'tatianaguirre@hotmail.com', 'Bib1234567');


insert into t_mae_bibliotecario_bib (cedula_bib, nombre_bib, telefono_bib, turno_bib, mail_bib, clave_bib) 
values ('1356723419', 'Jefferson Carrillo', '0987676541', 'Vespertino', 'tatianaguirre@hotmail.com', 'Bib1234567');


insert into t_mae_bibliotecario_bib (cedula_bib, nombre_bib, telefono_bib, turno_bib, mail_bib, clave_bib) 
values ('1452678190', 'Stalin Proaño', '0981234561', 'Nocturno', 'tatianaguirre@hotmail.com', 'Bib1234567');

-- fin ingreso bibliotecario --
select  * from t_mae_bibliotecario_bib;

-- inicio  ingreso documento --

insert into t_mae_documento_bib ( isbn_doc, autor_doc, editorial_doc, titulo_doc, area_doc, anio_doc, tipo_doc, precio_doc, disponibilidad_doc, reservados_doc) 
values ('isbn12345', 'Antonie Castro', 'Santillana', 'Metodos Numericos', 'Matematicas', '2001', 'libro', 0.50, 2, 0) ;

insert into t_mae_documento_bib ( isbn_doc, autor_doc, editorial_doc, titulo_doc, area_doc, anio_doc, tipo_doc, precio_doc, disponibilidad_doc, reservados_doc) 
values ('isbn22222', 'Julio Mendoza', 'Libresa', 'Estadio', 'Futbol', '2016', 'revista', 0.20, 2, 0) ;
-- fin  ingreso documento --
select * from t_mae_documento_bib;
-- inicio  ingreso reserva --

insert into t_mov_reserva_bib (T_MAE_ESTUDIANTE_BIB_id_est, T_MAE_BIBLIOTECARIO_BIB_id_bib, T_MAE_DOCUMENTO_BIB_id_doc,  fechareserva_res, fechaprestamo_res, fechaentrega_res, fechadevolucion_res, subtotal_res, total_res, multa_res  )
values(1, 1, 1,  '2017-03-04 14:34:00', '2017-03-05 08:30:15', '2017-03-07 08:30:15', '2017-03-09 13:00:00', 2.00, 2.00, 1.00 );

insert into t_mov_reserva_bib (T_MAE_ESTUDIANTE_BIB_id_est, T_MAE_BIBLIOTECARIO_BIB_id_bib, T_MAE_DOCUMENTO_BIB_id_doc,  fechareserva_res, fechaprestamo_res, fechaentrega_res, fechadevolucion_res, subtotal_res, total_res, multa_res  )
values(2, 2, 2, '2017-03-02 ', '2017-03-03 ', '2017-03-04 ', '2017-03-05 ', 2.00, 2.00, 1.00 );

insert into t_mov_reserva_bib (T_MAE_ESTUDIANTE_BIB_id_est, T_MAE_BIBLIOTECARIO_BIB_id_bib, T_MAE_DOCUMENTO_BIB_id_doc,  fechareserva_res, fechaprestamo_res, fechaentrega_res, fechadevolucion_res, subtotal_res, total_res, multa_res  )
values(1, 2, 1, '2017-03-05 ', '2017-03-06 ', '2017-03-07 ', '2017-03-08 ', 1.00, 1.00, 0.20 );
-- fin  ingreso reserva --
select * from t_mov_reserva_bib;