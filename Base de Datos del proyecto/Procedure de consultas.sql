use bd_biblioteca;


-- ------------------CONSULTA DE ESTUDIANTE CON PROCEDIMIENTO ALMACENADO---------------------------;

create procedure CONSULTAESTUDIANTE()
select cedula_est, nombre_est, telefono_est, direccion_est, semestre_est,nombre_fac, mail_est, clave_est  
from t_mae_estudiante_bib E inner join t_mae_facultad_bib F on  F.id_fac = E.T_MAE_FACULTAD_BIB_id_fac ;

call CONSULTAESTUDIANTE;


-- --------------------------------------FIN---------------------------------------------------------;

-- ------------------CONSULTA DE BIBLIOTECARIO CON PROCEDIMIENTO ALMACENADO--------------------------;

create procedure CONSULTABIBLIOTECARIO()
select cedula_bib, nombre_bib, telefono_bib, turno_bib, mail_bib, clave_bib
from t_mae_bibliotecario_bib;

call CONSULTABIBLIOTECARIO;

-- --------------------------------------------FIN---------------------------------------------------;

-- ------------------CONSULTA DE DOCUMENTO CON PROCEDIMIENTO ALMACENADO-------------------------------;

create procedure CONSULTADOCUMENTO()
select isbn_doc, autor_doc, editorial_doc, titulo_doc, area_doc, anio_doc, tipo_doc, precio_doc, disponibilidad_doc, reservados_doc
from t_mae_documento_bib;

call CONSULTADOCUMENTO();

-- --------------------------------------------FIN---------------------------------------------------;

-- ------------------------CONSULTA DE RESERVA CON PROCEDIMIENTO ALMACENADO--------------------------;

create procedure CONSULTARESERVA()
select id_res , cedula_est,  nombre_est,  cedula_bib, nombre_bib, isbn_doc, titulo_doc, precio_doc, fechareserva_res, fechaprestamo_res, fechaentrega_res, fechadevolucion_res, subtotal_res, total_res, multa_res
from t_mov_reserva_bib R 
inner join t_mae_estudiante_bib E on   E.id_est = R.T_MAE_ESTUDIANTE_BIB_id_est  
inner join t_mae_bibliotecario_bib B on   B.id_bib = R.T_MAE_BIBLIOTECARIO_BIB_id_bib
inner join t_mae_documento_bib D on   D.id_doc = R.T_MAE_DOCUMENTO_BIB_id_doc;


call CONSULTARESERVA();


create procedure CONSULTARESERVAcedula(in variable varchar(10))
select id_res , cedula_est,  nombre_est,  cedula_bib, nombre_bib, isbn_doc, titulo_doc, precio_doc, fechareserva_res, fechaprestamo_res, fechaentrega_res, fechadevolucion_res, subtotal_res, total_res, multa_res
from t_mov_reserva_bib R 
inner join t_mae_estudiante_bib E on   E.id_est = R.T_MAE_ESTUDIANTE_BIB_id_est  
inner join t_mae_bibliotecario_bib B on   B.id_bib = R.T_MAE_BIBLIOTECARIO_BIB_id_bib
inner join t_mae_documento_bib D on   D.id_doc = R.T_MAE_DOCUMENTO_BIB_id_doc 
where cedula_est = variable;

 
call CONSULTARESERVAcedula(1302373434);

create procedure CONSULTARESERVAisbn_doc(in variable varchar(15))
select id_res , cedula_est,  nombre_est,  cedula_bib, nombre_bib, isbn_doc, titulo_doc, precio_doc, fechareserva_res, fechaprestamo_res, fechaentrega_res, fechadevolucion_res, subtotal_res, total_res, multa_res
from t_mov_reserva_bib R 
inner join t_mae_estudiante_bib E on   E.id_est = R.T_MAE_ESTUDIANTE_BIB_id_est  
inner join t_mae_bibliotecario_bib B on   B.id_bib = R.T_MAE_BIBLIOTECARIO_BIB_id_bib
inner join t_mae_documento_bib D on   D.id_doc = R.T_MAE_DOCUMENTO_BIB_id_doc 
where isbn_doc = variable;

drop procedure CONSULTARESERVAisbn_doc;
 
call CONSULTARESERVAisbn_doc('isbn12345');

create procedure CONSULTARESERVAisbn_idreser(in variable varchar(15))
select id_res , cedula_est,  nombre_est,  cedula_bib, nombre_bib, isbn_doc, titulo_doc, precio_doc, fechareserva_res, fechaprestamo_res, fechaentrega_res, fechadevolucion_res, subtotal_res, total_res, multa_res
from t_mov_reserva_bib R 
inner join t_mae_estudiante_bib E on   E.id_est = R.T_MAE_ESTUDIANTE_BIB_id_est  
inner join t_mae_bibliotecario_bib B on   B.id_bib = R.T_MAE_BIBLIOTECARIO_BIB_id_bib
inner join t_mae_documento_bib D on   D.id_doc = R.T_MAE_DOCUMENTO_BIB_id_doc 
where id_res = variable;
call CONSULTARESERVAisbn_idreser(2);


-- Procedimiento para actualizar Reserva
use bd_biblioteca;

create procedure ActualizarReserva(in id_reserva Integer,in id_est Integer,
in id_bib Integer,in id_doc Integer,in titulo_doc varchar(50),
in isbn_doc varchar(15),in precio_doc varchar(15))
update  t_mov_reserva_bib set

 T_MAE_ESTUDIANTE_BIB_id_est=id_est
,T_MAE_BIBLIOTECARIO_BIB_id_bib=id_bib
,T_MAE_DOCUMENTO_BIB_id_doc=id_doc 
,titulodocumento_res=titulo_doc
,isbdocumento_res=isbn_doc 
,preciodocumento_res=precio_doc
where id_res = id_reserva;
select*from t_mov_reserva_bib;
call ActualizarReserva(21,1,2,2,'talin','isbn22222','1.0');



create procedure ActualizarReserva2(in id_reserva Integer, in fecha_prestamo datetime, 
in fecha_entrega datetime, in subtotal double, in total double )
update  t_mov_reserva_bib set
fechaprestamo_res = fecha_prestamo,
fechaentrega_res = fecha_entrega,
subtotal_res= subtotal,
total_res = total
where id_res = id_reserva;



select*from t_mov_reserva_bib;
call ActualizarReserva2(21, '2017-03-12 00:00:00', '2017-03-16 00:00:00',2.5, 3.0);