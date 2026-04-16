-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 16 Apr 2026 pada 16.02
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `toko`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `login`
--

CREATE TABLE `login` (
  `idLog` int(5) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `login`
--

INSERT INTO `login` (`idLog`, `username`, `password`) VALUES
(1, 'Isek', 'Silvana'),
(2, 'Irsyad', 'Silvana'),
(3, 'test', 'hai'),
(4, 'hai', 'hai'),
(5, 'isekk', 'isekk');

-- --------------------------------------------------------

--
-- Struktur dari tabel `member`
--

CREATE TABLE `member` (
  `id` int(1) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `no_telp` varchar(13) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `paket` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `member`
--

INSERT INTO `member` (`id`, `nama`, `no_telp`, `alamat`, `paket`) VALUES
(2, ':', ':', ':', 'Gold'),
(3, ':', ':', ':yrr', 'Silver'),
(4, ':', ':', ':s', 'Silver'),
(5, ':', ':', ':test', '===Pilih Paket Member==='),
(6, 'Isek', '2424', ':294294', 'Bronze'),
(8, 'Irsyad', '09202', 'Kayutanam', 'Gold'),
(9, 'Irsyad Gumanof', '081365371272', 'Kayutanam', 'Bronze'),
(11, 'Ghalib', '084647544', 'Kayutanam', 'Gold'),
(14, 'Irza', '92842', 'Kayutanam', 'Platinum');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`idLog`);

--
-- Indeks untuk tabel `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `login`
--
ALTER TABLE `login`
  MODIFY `idLog` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT untuk tabel `member`
--
ALTER TABLE `member`
  MODIFY `id` int(1) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
