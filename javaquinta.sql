-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 19-Abr-2019 às 03:52
-- Versão do servidor: 10.1.38-MariaDB
-- versão do PHP: 7.3.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `javaquinta`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `codigo` int(11) NOT NULL,
  `nome` varchar(256) NOT NULL,
  `cpf` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`codigo`, `nome`, `cpf`) VALUES
(1, 'Rodrigo Paulo Bauernfeind', '11122233344'),
(2, 'Maria Ana França de Oliveira', '22233344455'),
(3, 'Melissa Rodrigues', '33344455566'),
(4, 'Laura Pertile', '44455566677'),
(5, 'Ana Barbara Rodrigues', '55566677788'),
(6, 'Alisson Manarim', '66677788899'),
(7, 'João Vendrusculo', '77788899900'),
(8, 'Juliana Vendrusculo', '88899900011'),
(9, 'Gustavo Eliseu Bauernfeind', '00011122233'),
(10, 'Fabiane Giusti', '65432198700'),
(11, 'Eliane Bauernfeind', '42277710997'),
(12, 'Maria Bauernfeind', '32165498700'),
(13, 'Pablo França de Oliveira', '12345678999'),
(14, 'Liz Maria de Mello Oliveira', '15948078963');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE `produto` (
  `codigo` int(11) NOT NULL,
  `nome` varchar(256) NOT NULL,
  `quantidade` int(6) DEFAULT NULL,
  `valor` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`codigo`, `nome`, `quantidade`, `valor`) VALUES
(1, 'Farinha', 10, '6.20'),
(2, 'Feijão', 40, '7.21'),
(4, 'Ketchup', 63, '6.28'),
(5, 'Mostarda', 744, '93.98'),
(6, 'Biscoito Recheado', 600, '9.35'),
(7, 'Café', 500, '9.18'),
(8, 'Chá', 325, '1.04'),
(9, 'Cheiro Verde', 1000, '0.82'),
(10, 'Ovo de Páscoa', 6000, '26.25'),
(11, 'Pote de plástico', 5, '84.00'),
(12, 'Sabonete Liquido', 3000, '94.36'),
(13, 'Mortadela', 452, '10.49'),
(14, 'Queijo Prato', 500, '42.34'),
(15, 'Rosquinha', 79, '150.00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `veiculo`
--

CREATE TABLE `veiculo` (
  `codigo` int(11) NOT NULL,
  `nome` varchar(256) NOT NULL,
  `marca` varchar(256) NOT NULL,
  `cor` varchar(256) NOT NULL,
  `ano` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `veiculo`
--

INSERT INTO `veiculo` (`codigo`, `nome`, `marca`, `cor`, `ano`) VALUES
(1, 'Linea', 'Fiat', 'Prata', 2015),
(2, 'Astra Sedan', 'Chevrolet', 'Preto', 2011),
(3, 'Grand Siena', 'Fiat', 'Preto', 2017),
(4, 'C4 Grand Picasso', 'Citroen', 'Preto', 2015),
(5, 'Escort', 'Ford', 'Azul', 1998),
(6, 'City', 'Honda', 'Cinza Chumbo', 2013),
(7, 'Fusion', 'Ford', 'Preto', 2018),
(8, 'HB20s', 'Hyundai', 'Branco', 2019),
(9, 'Fox', 'Volkswagen', 'Prata', 2013),
(10, 'Ka', 'Ford', 'Preto', 2018),
(11, '325i', 'BMW', 'Vermelho', 2019),
(12, 'A4', 'Audi', 'Branco Perola', 2017);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`codigo`);

--
-- Indexes for table `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`codigo`);

--
-- Indexes for table `veiculo`
--
ALTER TABLE `veiculo`
  ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `produto`
--
ALTER TABLE `produto`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `veiculo`
--
ALTER TABLE `veiculo`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
