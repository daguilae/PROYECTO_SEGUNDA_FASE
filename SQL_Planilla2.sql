-- drop database nomina_salario;
create database NOMINA_SALARIO;
use NOMINA_SALARIO;


-- drop table usuarios;
create table USUARIOS(
IdUsuario int primary key auto_increment,
NombreUsuario varchar (30) not null,
Pass varchar(12) not null
)Engine = InnoDB Default charset = Latin1;

create table DEPARTAMENTO
(
IdDepartamento int primary key auto_increment,
NombreDepartamento varchar (30) not null
)Engine = InnoDB Default charset = Latin1 ;

-- drop table puesto;
create table PUESTO
(
IdPuesto int primary key,
NombrePuesto varchar (30) not null,
CodigoDepartamento int,
foreign key(CodigoDepartamento) references DEPARTAMENTO (IdDepartamento)
)Engine = InnoDB Default charset = Latin1 ;


create table CONCEPTOS
(
Id_Concepto int primary key auto_increment,
NombreConcepto varchar (20) not null, /*si es igss o es isr */
AfectaConcepto varchar (1) not null,  /*A quienes afecta A= TODOS , B=algunos , C= excepcion */
valorConcepto float not null,   #promedio de cuanto es el igss o isr
TipoConcepto varchar(1) not null # A : por porcentaje , B : por cuota
#aca se determina si es tipo fijo o no 
#AplicarConcepto varchar (1) not null  #A= TODOS , B=algunos , C= excepcion


)Engine = InnoDB Default charset = Latin1 ;

-- drop table datos_empleado;
create table DATOS_EMPLEADO
(
Id_Empleado int primary key auto_increment,
CodigoPuesto int not null,
CodigoDepartamento int not null,
NombreEmpleado varchar (20) not null,
ApellidoEmpleado varchar (20) not null,
EdadEmpleado int (5) not null,
EstadoEmpleado varchar(20) not null,
foreign key(CodigoPuesto) references puesto (IdPuesto),
foreign key(CodigoDepartamento) references departamento (IdDepartamento)

)Engine = InnoDB Default charset = Latin1 ;

create table APLICAR_CONCEPTO(
Id_Aplicar int primary key auto_increment,
Id_Empleado int not null,
Id_Concepto int not null,
foreign key(Id_Empleado) references DATOS_EMPLEADO(Id_Empleado),
foreign key(Id_Concepto) references CONCEPTOS (Id_Concepto)

)Engine = InnoDB Default charset = Latin1 ;

create table REGISTROS(
IdRegristro int primary key auto_increment,
FechaRegistro date not null,
CodigoUsuario int not null,
CodigoEmpleado int not null,
foreign key(CodigoUsuario) references USUARIOS (IdUsuario),
foreign key(CodigoEmpleado) references DATOS_EMPLEADO(Id_Empleado)


)Engine = InnoDB Default charset = Latin1 ;

-- drop table sueldos;
create table SUELDOS
(
IdSueldo int primary key auto_increment,
CodigoEmpleado int,
IdPuesto int,
SalarioOrdinario float not null,
SalarioExtraordinario float not null,
Bonificacion float not null,
Comision float not null,
OtrosDevengados float not null,
TotalDevengado float not null,
Igss float not null,
Isr float not null,
Anticipos float not null,
DescuentosJudiciales float not null,
OtrosDescuentos float not null,
TotalDescuentos float not null,
TotalLiquido float not null,

foreign key(IdPuesto) references PUESTO(IdPuesto),
foreign key(CodigoEmpleado) references DATOS_EMPLEADO(Id_Empleado)
)Engine = InnoDB Default charset = Latin1 ;



create table CONTABILIDAD 
(
IdContabilidad int primary key,
Id_Aplicar int not null,
#ControlEmpleado int not null,
ControlDescuentos int not null,
ControlDevengados int not null,

#foreign key(ControlEmpleado) references DATOS_EMPLEADO (IdEmpleado),
foreign key(Id_Aplicar) references APLICAR_CONCEPTO(Id_Aplicar)


)Engine = InnoDB Default charset = Latin1 ;

create table usuario_administrador
(
Id_Admin int primary key auto_increment,
Usuario_Admin varchar (60) not null,
pass varchar (60) not null

)engine=InnoDB Default charset = Latin1 ;

#drop database NOMINA_SALARIO;