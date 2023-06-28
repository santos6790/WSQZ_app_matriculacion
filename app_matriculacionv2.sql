-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-12-2021 a las 05:52:16
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `app_matriculacionv2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carreras`
--

CREATE TABLE `carreras` (
  `id_carrera` int(10) UNSIGNED NOT NULL,
  `nombre` varchar(80) DEFAULT NULL,
  `descripcion` varchar(80) DEFAULT NULL,
  `direccion` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `carreras`
--

INSERT INTO `carreras` (`id_carrera`, `nombre`, `descripcion`, `direccion`) VALUES
(1, 'Ingeniería de Sistemas', 'CARRERAS SIN ÁREA', 'Complejo'),
(2, 'Derecho', 'CARRERAS SIN ÁREA', 'Complejo'),
(3, 'Ciencias políticas', 'CARRERAS SIN ÁREA', 'Complejo'),
(4, 'Ciencias físicas y energías alternativas', 'CARRERAS SIN ÁREA', 'Complejo'),
(5, 'Contaduría pública', 'CIENCIAS ECONÓMICAS, FINANCIERAS Y ADMINISTRATIVAS', 'Complejo'),
(6, 'Economía', 'CIENCIAS ECONÓMICAS, FINANCIERAS Y ADMINISTRATIVAS', 'Complejo'),
(7, 'Administración de empresas', 'CIENCIAS ECONÓMICAS, FINANCIERAS Y ADMINISTRATIVAS', 'Complejo'),
(8, 'Comercio internacional', 'CIENCIAS ECONÓMICAS, FINANCIERAS Y ADMINISTRATIVAS', 'Complejo'),
(9, 'Gestión turistica y hotelera', 'CIENCIAS ECONÓMICAS, FINANCIERAS Y ADMINISTRATIVAS', 'Complejo'),
(10, 'Ingeniería en producción empresarial', 'INGENIERIA DESARROLLO TECNOLÓGICO PRODUCTIVO', 'Complejo'),
(11, 'Ingeniería electronica', 'INGENIERIA DESARROLLO TECNOLÓGICO PRODUCTIVO', 'Complejo'),
(12, 'Ingeniería textil', 'INGENIERIA DESARROLLO TECNOLÓGICO PRODUCTIVO', 'Complejo'),
(13, 'Ingeniería electrica', 'INGENIERIA DESARROLLO TECNOLÓGICO PRODUCTIVO', 'Complejo'),
(14, 'Ingeniería autotrónica', 'INGENIERIA DESARROLLO TECNOLÓGICO PRODUCTIVO', 'Complejo'),
(15, 'Ingeniería ambiental', 'INGENIERIA DESARROLLO TECNOLÓGICO PRODUCTIVO', 'Complejo'),
(16, 'Enfermería', 'CIENCIAS DE LA SALUD', 'Complejo'),
(17, 'Medicina', 'CIENCIAS DE LA SALUD', 'Complejo'),
(18, 'Odontología', 'CIENCIAS DE LA SALUD', 'Complejo'),
(19, 'Nutrición y dietética', 'CIENCIAS DE LA SALUD', 'Complejo'),
(20, 'Tecnología en laboratorio dental\r\n', 'CIENCIAS DE LA SALUD', 'Complejo'),
(21, 'Ciencias del desarrollo', 'CIENCIAS SOCIALES', 'Complejo'),
(22, 'Ciencias de la comunicación social', 'CIENCIAS SOCIALES', 'Complejo'),
(23, 'Historia', 'CIENCIAS SOCIALES', 'Complejo'),
(24, 'Linguística e idiomas', 'CIENCIAS SOCIALES', 'Complejo'),
(25, 'Sociología', 'CIENCIAS SOCIALES', 'Complejo'),
(26, 'Trabajo social', 'CIENCIAS SOCIALES', 'Complejo'),
(27, 'Psicología', 'CIENCIAS SOCIALES', 'Complejo'),
(28, 'Arquitectura', 'CIENCIAS Y ARTES DEL HÁBITAT', 'Complejo'),
(29, 'Artes plásticas', 'CIENCIAS Y ARTES DEL HÁBITAT', 'Complejo'),
(30, 'Ciencias de la educación', 'CIENCIAS DE LA EDUCACÍON', 'Complejo'),
(31, 'Educación parvularia', 'CIENCIAS DE LA EDUCACÍON', 'Complejo'),
(32, 'Psicomotricidad y deportes', 'CIENCIAS DE LA EDUCACÍON', 'Complejo'),
(33, 'Música', 'CIENCIAS DE LA EDUCACÍON', 'Complejo'),
(34, 'Ingeniería agronómica', 'CIENCIAS AGRICOLAS, PECUARIAS Y RECURSOS NATURALES', 'Complejo'),
(35, 'Medicina veterinaria y zootecnia', 'CIENCIAS AGRICOLAS, PECUARIAS Y RECURSOS NATURALES', 'Complejo'),
(36, 'Ingeniería en zootecnia e industria pecuaria', 'CIENCIAS AGRICOLAS, PECUARIAS Y RECURSOS NATURALES', 'Complejo'),
(37, 'Ingeniería civil', 'CIENCIA Y TECNOLOGÍA', 'Complejo'),
(38, 'Ingeniería de gas y petroquímica', 'CIENCIA Y TECNOLOGÍA', 'Complejo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categorias`
--

CREATE TABLE `categorias` (
  `id_categoria` int(10) UNSIGNED NOT NULL,
  `nombre` varchar(80) DEFAULT NULL,
  `descripcion` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `categorias`
--

INSERT INTO `categorias` (`id_categoria`, `nombre`, `descripcion`) VALUES
(1, 'Dispensacion', 'Modalidad de entrada bajo examen directo'),
(2, 'Pre Universitario', 'Modalidad de entrada bajo examen tras cursos anteriores'),
(3, 'Exacelencia', 'Modalidad de entrada por excelencia académica');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `gestiones`
--

CREATE TABLE `gestiones` (
  `id_gestion` int(10) UNSIGNED NOT NULL,
  `nombre` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `gestiones`
--

INSERT INTO `gestiones` (`id_gestion`, `nombre`) VALUES
(1, '2020'),
(2, '2021'),
(3, '2022'),
(4, '2019'),
(5, '2018');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `matriculas`
--

CREATE TABLE `matriculas` (
  `id_matricula` int(10) UNSIGNED NOT NULL,
  `costo` int(11) DEFAULT NULL,
  `f_matriculacion` date DEFAULT NULL,
  `nro_deposito` int(11) DEFAULT NULL,
  `id_usuario` int(10) UNSIGNED NOT NULL,
  `id_categoria` int(10) UNSIGNED NOT NULL,
  `id_carrera` int(10) UNSIGNED NOT NULL,
  `id_sede` int(10) UNSIGNED NOT NULL,
  `id_gestion` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sedes`
--

CREATE TABLE `sedes` (
  `id_sede` int(10) UNSIGNED NOT NULL,
  `nombre` varchar(80) DEFAULT NULL,
  `direccion` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `sedes`
--

INSERT INTO `sedes` (`id_sede`, `nombre`, `direccion`) VALUES
(1, 'Sede Principal', 'Villa Esperanza'),
(2, 'Sede Chaguaya de la UPEA', 'Provincia Camacho'),
(4, 'Sede Ancoraimes de la UPEA', 'Provincia Omasuyos'),
(5, 'Sede Achacachi de la UPEA', 'Provincia Omasuyos'),
(6, 'Sede Batallas de la UPEA', 'Provincia Los Andes'),
(7, 'Sede Guaqui de la UPEA', 'Provincia Ingavi'),
(8, 'Sede Viacha de la UPEA', 'Provincia Ingavi'),
(9, 'Sede Cruz Loma de la UPEA', 'Provincia Nor Yungas'),
(10, 'Sede Caranavi de la UPEA', 'Provincia Caranavi'),
(11, 'Sede Palos Blancos de la UPEA', 'Provincia Larecaja'),
(12, 'Sede San Antonio de la UPEA', 'Provincia Caranavi'),
(13, 'Sede Mapiri de la UPEA', 'Provincia Larecaja');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` int(10) UNSIGNED NOT NULL,
  `ap_paterno` varchar(30) DEFAULT NULL,
  `ap_materno` varchar(30) DEFAULT NULL,
  `nombres` varchar(30) DEFAULT NULL,
  `ci` int(11) DEFAULT NULL,
  `ru` int(11) DEFAULT NULL,
  `celular` int(11) DEFAULT NULL,
  `correo` varchar(255) DEFAULT NULL,
  `direccion` varchar(150) DEFAULT NULL,
  `f_nac` date DEFAULT NULL,
  `n_titulo_bachiller` varchar(250) DEFAULT NULL,
  `foto` varchar(250) DEFAULT NULL,
  `nick` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `estado` int(11) DEFAULT NULL,
  `nivel` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `ap_paterno`, `ap_materno`, `nombres`, `ci`, `ru`, `celular`, `correo`, `direccion`, `f_nac`, `n_titulo_bachiller`, `foto`, `nick`, `password`, `estado`, `nivel`) VALUES
(1, 'Mamani', 'Flores', 'Juan', 49853168, 200026135, 73151315, 'Juan@juan.com', 'Z.San miguel C.14 Nro.452', '1985-01-07', '123546', 'default.jpg', 'Juan', 'a9993e364706816aba3e25717850c26c9cd0d89d', 1, 2),
(2, 'Quispe', 'Choque', 'Carlos', 45693236, 200045613, 76431535, 'Carlos@carlos.com', 'Z.San miguel C.14 Nro.453', '1996-03-09', '546846', 'default.jpg', 'Carlos', 'a9993e364706816aba3e25717850c26c9cd0d89d', 1, 2),
(3, 'Vargas', 'Condori', 'Jose', 16985465, 200051315, 75646845, 'Jose@jose.com', 'Z.San miguel C.14 Nro.454', '1992-05-11', '118435', 'default.jpg', 'Jose', 'a9993e364706816aba3e25717850c26c9cd0d89d', 1, 2),
(4, 'Rodriguez', 'Rojas', 'Luis', 59823684, 200051354, 64865155, 'Luis@luis.com', 'Z.San miguel C.14 Nro.455', '1994-07-13', '354830', 'default.jpg', 'Luis', 'a9993e364706816aba3e25717850c26c9cd0d89d', 1, 2),
(5, 'Gutierrez', 'Lopez', 'Marco', 46231289, 200025384, 75463151, 'Marco@marco.com', 'Z.San miguel C.14 Nro.456', '1996-09-15', '135054', 'default.jpg', 'Marco', 'a9993e364706816aba3e25717850c26c9cd0d89d', 1, 2),
(6, 'Fernandez', 'Gonzales', 'Antonio', 47856288, 200013538, 62318318, 'Antonio@antonio.com', 'Z.San miguel C.14 Nro.457', '1998-11-17', '268612', 'default.jpg', 'Antonio', 'a9993e364706816aba3e25717850c26c9cd0d89d', 1, 2),
(7, 'Garcia', 'Cruz', 'Miguel', 49863458, 200015318, 63518483, 'Miguel@miguel.com', 'Z.San miguel C.14 Nro.458', '1997-12-20', '313549', 'default.jpg', 'Miguel', 'a9993e364706816aba3e25717850c26c9cd0d89d', 1, 2),
(8, 'Perez', 'Mendoza', 'Victor', 45648513, 200086864, 75513212, 'Victor@victor.com', 'Z.San miguel C.14 Nro.459', '1999-10-22', '315315', 'default.jpg', 'Victor', 'a9993e364706816aba3e25717850c26c9cd0d89d', 1, 2),
(9, 'Sanchez', 'Martinez', 'Fernando', 54681321, 200021351, 64843184, 'Fernando@fernando.com', 'Z.San miguel C.14 Nro.460', '2000-08-24', '38084', 'default.jpg', 'Fernando', 'a9993e364706816aba3e25717850c26c9cd0d89d', 1, 2),
(10, 'Chavez', 'Ramos', 'Jorge', 54684315, 200031535, 68435348, 'Jorge@jorge.com', 'Z.San miguel C.14 Nro.461', '2002-06-26', '305848', 'default.jpg', 'Jorge', 'a9993e364706816aba3e25717850c26c9cd0d89d', 1, 2),
(11, 'Apaza', 'Huanca', 'David', 78984351, 200015315, 78643538, 'David@david.com', 'Z.San miguel C.14 Nro.462', '1991-04-28', '305561', 'default.jpg', 'David', 'a9993e364706816aba3e25717850c26c9cd0d89d', 1, 2),
(12, 'Guzman', 'Torrez', 'Mario', 45135488, 200051355, 73483455, 'Mario@mario.com', 'Z.San miguel C.14 Nro.463', '1993-02-01', '23168', 'default.jpg', 'Mario', 'a9993e364706816aba3e25717850c26c9cd0d89d', 1, 2),
(13, 'Aguilar', 'Suarez', 'Martha', 65953213, 200015435, 75343483, 'Martha@martha.com', 'Z.San miguel C.14 Nro.464', '1995-07-03', '516845', 'default.jpg', 'Martha', 'a9993e364706816aba3e25717850c26c9cd0d89d', 1, 2),
(14, 'Romero', 'Justiniano', 'Roxana', 78651321, 200013155, 61345345, 'Roxana@roxana.com', 'Z.San miguel C.14 Nro.465', '1997-03-05', '35168', 'default.jpg', 'Roxana', 'a9993e364706816aba3e25717850c26c9cd0d89d', 1, 2),
(15, 'Vasquez', 'Colque', 'Ana', 13125468, 200034844, 64354388, 'Ana@ana.com', 'Z.San miguel C.14 Nro.466', '1998-05-07', '213848', 'default.jpg', 'Ana1', 'a9993e364706816aba3e25717850c26c9cd0d89d', 1, 2),
(16, 'Miranda', 'Ramirez', 'Maria', 12398856, 200013543, 71315853, 'Maria@maria.com', 'Z.San miguel C.14 Nro.467', '1987-09-10', '202055', 'default.jpg', 'Maria', 'a9993e364706816aba3e25717850c26c9cd0d89d', 1, 2),
(17, 'Ortiz', 'Soliz', 'Juana', 53484313, 200068786, 75434835, 'Juana@juana.com', 'Z.San miguel C.14 Nro.468', '1989-05-21', '658484', 'default.jpg', 'Juana', 'a9993e364706816aba3e25717850c26c9cd0d89d', 1, 2),
(18, 'Ticona', 'Villca', 'Ana', 51315486, 200013545, 65434534, 'Ana1@ana.com', 'Z.San miguel C.14 Nro.469', '1992-12-25', '131894', 'default.jpg', 'Ana', 'a9993e364706816aba3e25717850c26c9cd0d89d', 1, 2),
(19, 'Chambi', 'Alvarez', 'Patricia', 41213488, 200054684, 67864534, 'Patricia@patricia.com', 'Z.San miguel C.14 Nro.470', '2000-04-18', '516813', 'default.jpg', 'Patricia', 'a9993e364706816aba3e25717850c26c9cd0d89d', 1, 2),
(20, 'Calle', 'Espinoza', 'Lidia', 10023548, 200031545, 78648445, 'Lidia@lidia.com', 'Z.San miguel C.14 Nro.471', '1999-09-27', '435684', 'default.jpg', 'Lidia', 'a9993e364706816aba3e25717850c26c9cd0d89d', 1, 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `carreras`
--
ALTER TABLE `carreras`
  ADD PRIMARY KEY (`id_carrera`);

--
-- Indices de la tabla `categorias`
--
ALTER TABLE `categorias`
  ADD PRIMARY KEY (`id_categoria`);

--
-- Indices de la tabla `gestiones`
--
ALTER TABLE `gestiones`
  ADD PRIMARY KEY (`id_gestion`);

--
-- Indices de la tabla `matriculas`
--
ALTER TABLE `matriculas`
  ADD PRIMARY KEY (`id_matricula`),
  ADD KEY `id_usuario` (`id_usuario`),
  ADD KEY `id_categoria` (`id_categoria`),
  ADD KEY `id_carrera` (`id_carrera`),
  ADD KEY `id_sede` (`id_sede`),
  ADD KEY `id_gestion` (`id_gestion`);

--
-- Indices de la tabla `sedes`
--
ALTER TABLE `sedes`
  ADD PRIMARY KEY (`id_sede`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`),
  ADD UNIQUE KEY `correo` (`correo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `carreras`
--
ALTER TABLE `carreras`
  MODIFY `id_carrera` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT de la tabla `categorias`
--
ALTER TABLE `categorias`
  MODIFY `id_categoria` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `gestiones`
--
ALTER TABLE `gestiones`
  MODIFY `id_gestion` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `matriculas`
--
ALTER TABLE `matriculas`
  MODIFY `id_matricula` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `sedes`
--
ALTER TABLE `sedes`
  MODIFY `id_sede` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `matriculas`
--
ALTER TABLE `matriculas`
  ADD CONSTRAINT `matriculas_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`),
  ADD CONSTRAINT `matriculas_ibfk_2` FOREIGN KEY (`id_categoria`) REFERENCES `categorias` (`id_categoria`),
  ADD CONSTRAINT `matriculas_ibfk_3` FOREIGN KEY (`id_carrera`) REFERENCES `carreras` (`id_carrera`),
  ADD CONSTRAINT `matriculas_ibfk_4` FOREIGN KEY (`id_sede`) REFERENCES `sedes` (`id_sede`),
  ADD CONSTRAINT `matriculas_ibfk_5` FOREIGN KEY (`id_gestion`) REFERENCES `gestiones` (`id_gestion`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
