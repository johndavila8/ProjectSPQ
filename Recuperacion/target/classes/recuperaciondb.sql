-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-06-2021 a las 17:44:58
-- Versión del servidor: 10.4.19-MariaDB
-- Versión de PHP: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `recuperaciondb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sequence_table`
--

CREATE TABLE `sequence_table` (
  `SEQUENCE_NAME` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `NEXT_VAL` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `sequence_table`
--

INSERT INTO `sequence_table` (`SEQUENCE_NAME`, `NEXT_VAL`) VALUES
('com.Recuperacion.Recuperacion.Clases.Usuario', 11);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarea`
--

CREATE TABLE `tarea` (
  `IDTAREA` int(11) NOT NULL,
  `DESCRIPCION` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `FECHA` timestamp NULL DEFAULT NULL,
  `NOMBRE` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `TAREASPENDIENTES_IDUSUARIO_OWN` int(11) DEFAULT NULL,
  `TAREASPENDIENTES_INTEGER_IDX` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `IDUSUARIO` int(11) NOT NULL,
  `NOMBRE` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `PW` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`IDUSUARIO`, `NOMBRE`, `PW`) VALUES
(1, 'prubea', '1');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `sequence_table`
--
ALTER TABLE `sequence_table`
  ADD PRIMARY KEY (`SEQUENCE_NAME`);

--
-- Indices de la tabla `tarea`
--
ALTER TABLE `tarea`
  ADD PRIMARY KEY (`IDTAREA`),
  ADD KEY `TAREA_FK1` (`TAREASPENDIENTES_IDUSUARIO_OWN`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`IDUSUARIO`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tarea`
--
ALTER TABLE `tarea`
  ADD CONSTRAINT `TAREA_FK1` FOREIGN KEY (`TAREASPENDIENTES_IDUSUARIO_OWN`) REFERENCES `usuario` (`IDUSUARIO`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
