CREATE TABLE profesor(
	idProfesor SERIAL PRIMARY KEY,
	nombre VARCHAR(50),
	apellido VARCHAR(50),
	telefono int,
	email VARCHAR(80),
	password VARCHAR(50),
	fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	status BOOLEAN
);

CREATE TABLE estudiante(
	idEstudiante SERIAL PRIMARY KEY,
	nombre VARCHAR(50),
	apellido VARCHAR(50),
	telefono int,
	email VARCHAR(80),
	fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	status BOOLEAN
);

CREATE TABLE curso(
	idCurso SERIAL PRIMARY KEY,
	nombre VARCHAR(50),
	fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	status BOOLEAN
);

CREATE TABLE materia(
	idMateria SERIAL PRIMARY KEY,
	nombre VARCHAR(50),
	fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	status BOOLEAN
);

CREATE TABLE inscripcion(
	idInscripcion SERIAL PRIMARY KEY,
	estudiante_id INT REFERENCES estudiante(idEstudiante),
	curso_id INT REFERENCES curso(idCurso),
	fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	status BOOLEAN 
);

CREATE TABLE asignacion(
	idAsignacion SERIAL PRIMARY KEY,
	profesor_id INT REFERENCES profesor(idProfesor),
	materia_id INT REFERENCES materia(idMateria),
	curso_id INT REFERENCES curso(idCurso),
	fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	status BOOLEAN
);

CREATE TABLE asistencia(
	idAsistencia SERIAL PRIMARY KEY,
	estudiante_id INT REFERENCES estudiante(idEstudiante),
	profesor_id INT REFERENCES profesor(idProfesor),
	fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	status BOOLEAN 
);
