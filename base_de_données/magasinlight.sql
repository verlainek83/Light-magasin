-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mer. 10 juin 2020 à 20:01
-- Version du serveur :  10.4.11-MariaDB
-- Version de PHP : 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `magasinlight`
--

-- --------------------------------------------------------

--
-- Structure de la table `clients`
--

CREATE TABLE `clients` (
  `NumCli` int(11) NOT NULL,
  `Titre` varchar(80) NOT NULL DEFAULT '''Monsieur'', ''Madame'', ''Mademoiselle''',
  `Nom` varchar(25) NOT NULL,
  `Prenom` varchar(25) NOT NULL,
  `Adresse` varchar(50) NOT NULL,
  `CP` int(11) NOT NULL,
  `Ville` varchar(50) NOT NULL
) ;

--
-- Déchargement des données de la table `clients`
--

INSERT INTO `clients` (`NumCli`, `Titre`, `Nom`, `Prenom`, `Adresse`, `CP`, `Ville`) VALUES
(1, 'Monsieur', 'Koumwei', 'Tim', 'Rue Gustave Van Huynegem 32', 1000, 'BRUXELLES'),
(2, 'Mademoiselle', 'Viron', 'Nathalie', 'rue de la neuville 18', 1348, 'Louvain-La-Neuve'),
(3, 'Monsieur', 'Aarts', 'Jacob', ' Markt 1', 9700, 'Oudenaarde'),
(4, 'Madame', 'Balis', 'Emily', 'Trekweg Linkeroever 1/bus 1', 9700, 'Oudenaarde'),
(5, 'Mademoiselle', 'Baes', 'Baes', 'Bergstraat 3A', 9790, 'Wortegem-Petegem'),
(6, 'Monsieur', 'Bernard', 'Michael', 'Ronde van Vlaanderenstraat 3', 9690, 'Kluisbergen'),
(7, 'Madame', 'Bernardon', 'Brianna', 'Louise-Mariestraat 17', 9680, 'Maarkedal'),
(8, 'Monsieur', 'Bernard', 'Andrew', ' Rue Glacenée 7', 7864, 'Lessines'),
(9, 'Monsieur', 'Blanchard', 'Daniel', ' Rue d\'en Haut 18', 7864, ' Lessines'),
(10, 'Mademoiselle', 'Blanckaert', 'Alexis', 'Rue du Marais 13', 7912, 'Frasnes-lez-Anvaing'),
(13, 'Mademoiselle', 'Blommaert', 'Mackenzie', 'Rue du Joncquoy 8', 7910, 'Arc'),
(15, 'Mademoiselle', 'Blumengärtner', 'Isabella', 'Rue du Vieux Comté 5', 7742, 'Pecq'),
(16, 'Monsieur', 'Cardone', 'Caleb', 'Postweg 6', 2220, 'Heist-op-den-Berg'),
(17, 'Monsieur', 'Charlier', 'Cameron', 'Roostweg 7', 3150, 'Haacht'),
(18, 'Madame', 'Wuyts', 'Ella', 'Naamsestraat 3', 3000, 'Leuven'),
(19, 'Madame', 'MOORE', 'Melissa', 'Rue de la Briqueterie 14', 5377, 'Somme-Leuze'),
(20, 'Mademoiselle', 'Wouters', 'Angelina', 'Rue de Vérenne 18', 5377, 'Somme-Leuze'),
(21, 'Monsieur', 'Wolf', 'Blake', ' Rue du Bois Nolomont 4', 5377, 'Somme-Leuze'),
(22, 'Madame', ' De Witte', 'Melissa', 'Rue du Bois Nolomont 9', 5377, 'Heure-en-Famenne'),
(23, 'Madame', 'Willems', 'Julian', ' Boulevard Maurice Herbette 63', 1070, 'Anderlecht'),
(25, 'Mademoiselle', 'Willemet', 'Leslie', 'Boulevard Maurice Herbette 63', 1070, 'Anderlecht'),
(26, 'Monsieur', 'Willaume', 'Dominic', 'Avenue du Port 88', 1000, 'Bruxelles'),
(28, 'Madame', 'De Wilde', 'Andrea', 'Rue du Champ de l\'Eglise 89', 1020, 'Bruxelles'),
(29, 'Madame', 'Wautrin', 'Zoe', 'Boulevard Lambermont 1 ', 1000, 'Bruxelles'),
(30, 'Monsieur', 'Vinçotte', 'Jackson', 'Romeinsesteenweg 199', 1800, 'Vilvoorde'),
(31, 'Monsieur', 'De Vos', 'Connor', 'Sint Anna Laan 125 ', 1853, 'Grimbergen'),
(32, 'Monsieur', 'Vinçotte', 'Jackson', 'Romeinsesteenweg 199', 1800, 'Vilvoorde'),
(33, 'Monsieur', 'De Vos', 'Connor', 'Sint Anna Laan 125 ', 1853, 'Grimbergen'),
(34, 'Mademoiselle', 'Vinchon', 'Natalie', 'Grotewinkellaan 106', 1853, 'Grimbergen'),
(35, 'Madame', ' De Villers', 'Rachel', 'Oordegemsesteenweg 215', 9230, 'Wetteren'),
(36, 'Monsieur', 'Vervoort', 'Austin', 'Kleine Smetledestraat 12', 9230, 'Wetteren'),
(37, 'Monsieur', 'Verschueren', 'Thomas', 'Oordegemsesteenweg 220', 9230, 'Wetteren'),
(38, 'Monsieur', 'Vermeiren', 'Sylvain', 'Avenue des musiciens B19', 1348, 'Louvain-La-Neuve'),
(39, 'Mademoiselle', 'Vermeren', 'Allison', 'Olmenlaan, 9230', 9230, ' Wetteren'),
(40, 'Monsieur', 'Verlynden', 'Eric', 'Avenue du Fond des Carpes 4, 1380 Lasne', 1380, 'Plancenoit'),
(43, 'Monsieur', 'Verhaeghe', 'Xavier', 'Rue du Mouton 12', 1380, 'Plancenoit'),
(46, 'Monsieur', 'Vercruysse', 'Richard', 'Chemin de Camuselle 9', 1380, 'Plancenoit'),
(47, 'Monsieur', 'Verbruggen', 'Timothy', 'Clos Trou du Renard 5', 1380, 'Plancenoit'),
(48, 'Mademoiselle', 'Richardeau', 'Julia', 'Chaussée de Charleroi 18', 1380, 'Plancenoit'),
(49, 'Mademoiselle', ' Reynders', 'Sophie', 'Chaussée de Charleroi 16', 1380, 'Plancenoit - Lasne'),
(50, 'Madame', 'Proost', 'Anna', 'Chaussée de Charleroi 2', 1380, 'Lasne'),
(51, 'Mademoiselle', 'Prevotat', 'Elizabeth', 'Route du Lion 1815', 1420, 'Braine-l\'Alleud'),
(54, 'Monsieur', 'Poncelet', 'Michael', 'Route du Lion 1815', 1420, 'Braine-l\'Alleud'),
(55, 'Madame', 'Pirotte', 'Grace', 'Route du Lion 130', 1420, 'Braine-l\'Alleud'),
(56, 'Monsieur', 'Smith', 'Jamal', 'Chaussée de Mont-Saint-Jean 83', 1420, 'Braine-l\'Alleud'),
(59, 'Monsieur', 'Llyod', 'Georges', 'Chaussée de Mont-Saint-Jean 4', 1420, 'Braine-l\'Alleud'),
(60, 'Mademoiselle', 'Martin', 'Jacqueline', 'Chaussée Reine Astrid 105', 1420, 'Braine-l\'Alleud'),
(61, 'Madame', 'Lauwers', 'Rebecca', 'Rue du Ménil 45', 1420, 'Braine-l\'Alleud'),
(62, 'Mademoiselle', 'Le Brasseur', 'Leslie', 'Chaussée d\'Alsemberg 244', 1420, 'Braine-l\'Alleud'),
(63, 'Mademoiselle', 'Leclercq', 'Stephanie', 'Alsembergsesteenweg 589', 1653, 'Dworp'),
(64, 'Mademoiselle', 'Lambricks', 'Alexandra', 'Alsembergsesteenweg 671', 1653, 'Dworp'),
(65, 'Madame', 'Laenen', 'Gabrielle', 'Lotsesteenweg 103', 1653, 'Dworp'),
(66, 'Monsieur', 'Lejeune', 'Stephanie', '2, Padenborre', 1653, 'Dworp'),
(67, 'Monsieur', 'Jeunet', 'Nathaniel', 'Sollenbeemd', 1654, 'Beersel'),
(68, 'Monsieur', 'Janssen', 'Devin', 'A. Vaucampslaan 135', 1654, 'Beersel'),
(69, 'Monsieur', 'Jonnet', 'Matthieu', 'Guido Gezellestraat 69', 1654, 'Huizingen'),
(70, 'Madame', 'Keetels', 'Marcelle', 'Guido Gezellestraat 11', 1654, 'Halle'),
(71, 'Monsieur', 'Jorissen', 'Vaujany', 'A. Vaucampslaan 26', 1654, 'Beersel'),
(72, 'Monsieur', 'Jeuniaux', 'Simon', 'Vaartkant-West 25', 1600, 'Sint-Pieters-Leeuw'),
(73, 'Mademoiselle', 'Huys', 'Leonie', 'G. Demeurslaan 132', 1654, 'Beersel'),
(74, 'Monsieur', 'Houvenaghel', 'Thibaut', 'Verlengde Stallestraat 200', 1620, 'Drogenbos'),
(75, 'Madame', 'Hendrickx', 'Paige', 'Rue Longue 290', 1620, 'Drogenbos'),
(76, 'Monsieur', 'Delhaye', 'Vincent', 'Av. Paul Gilson, laan 455', 1620, 'Drogenbos'),
(77, 'Madame', 'Hoefnagels ', 'lily', 'Rue de Bempt 38', 1620, 'Drogenbos'),
(78, 'Monsieur', 'Hayes', 'Dominic', 'Verlengde Stallestraat 215B', 1620, 'Drogenbos'),
(79, 'Monsieur', 'Hendrickx', 'Adam', 'Paul Gilsonlaan 455B', 1620, 'Drogenbos'),
(80, 'Mademoiselle', 'Hubert', 'Solene', 'Paul Gilsonlaan 486', 1620, 'Drogenbos'),
(81, 'Monsieur', 'Holemans', 'Yann', 'Chaussée de Ruisbroek 378', 1620, 'Drogenbos'),
(82, 'Madame', 'Hincker', 'Leslie', 'Dorent 38', 1620, 'Drogenbos'),
(83, 'Monsieur', 'Helmans', 'Mehdi', 'Rue d\'Anderlecht 33', 1620, 'Drogenbos'),
(84, 'Mademoiselle', 'Henry', 'Lilian', 'Chaussée de Mons 144', 1600, 'Sint-Pieters-Leeuw'),
(85, 'Monsieur', 'De Greef', 'Bert', 'Chaussée de Mons 77', 1600, 'Sint-Pieters-Leeuw'),
(86, 'Madame', 'Grandjean', 'Caroline', 'Brusselbaan 136', 1600, 'Sint-Pieters-Leeuw'),
(87, 'Monsieur', 'Grandier', 'Thibault', 'Brusselbaan 160', 1600, 'Sint-Pieters-Leeuw'),
(88, 'Monsieur', 'Hermann', 'Oscar', 'Square Marie Curie 12', 1070, 'Anderlecht'),
(89, 'Madame', 'Hincker', 'Melanie', 'Route de Lennik 1358', 1602, ' Vlezenbeek'),
(90, 'Monsieur', 'Franzman', 'Timothy', 'Lostraat 99', 1703, 'Dilbeek'),
(91, 'Mademoiselle', 'Van den Bossche', 'Victoria', 'Termurenlaan 20', 9300, 'Aalst'),
(92, 'Mademoiselle', 'Van de Veld', 'Marie', 'Hopmarkt 52', 9300, 'Aalst'),
(93, 'Monsieur', 'Van de Veld', 'Jan', 'Gentsestraat 151', 9300, 'Aalst'),
(94, 'Monsieur', 'Van de Poel', 'Loic', 'Gentse steenweg 55', 9300, 'Aalst'),
(95, 'Monsieur', 'Tweelinckx', 'Hector', 'Gentsesteenweg 135', 9300, 'Aalst'),
(96, 'Madame', 'Tumson ', 'Janice', 'Merestraat 167', 9300, 'Aalst'),
(97, 'Monsieur', 'Tuin', 'Garrett', 'Gentsesteenweg 211', 9300, 'Aalst'),
(98, 'Mademoiselle', 'Tuilliet ', 'Janine', 'Nerumstraat 7', 9340, 'Lede'),
(99, 'Madame', 'Thuiliaux', 'Anne-Marie', 'Stationsstraat 30B', 9340, 'Lede'),
(100, 'Madame', 'Thuiliau', 'Peggy', 'Meirveld 13', 9340, 'Lede'),
(101, 'Mademoiselle', 'Urbain', 'Dorcas', 'Bredestraat 97', 9340, 'Lede'),
(102, 'Monsieur', 'Urting', 'Louis', 'Dorpstraat 43', 9260, 'Wichelen'),
(103, 'Monsieur', 'Van Bergh', 'Seth', 'Adolf Papeleustraat 89', 9230, 'Wetteren'),
(104, 'Madame', 'Van Caenegem', 'Sophie', 'Kragenweg 4', 2030, 'Antwerpen'),
(105, 'Madame', 'Slagmolder', 'Rachel', 'Polderdijkweg 25', 2030, 'Antwerpen'),
(106, 'Mademoiselle', 'Sinnesal', 'Armande', 'Scheldelaan 676', 2030, 'Antwerpen');

-- --------------------------------------------------------

--
-- Structure de la table `fournisseurs`
--

CREATE TABLE `fournisseurs` (
  `NumFour` int(11) NOT NULL,
  `Societe` varchar(50) NOT NULL,
  `Nom` varchar(25) NOT NULL,
  `Prenom` varchar(25) NOT NULL,
  `Adresse` varchar(50) NOT NULL,
  `CP` int(11) NOT NULL,
  `Ville` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `fournisseurs`
--

INSERT INTO `fournisseurs` (`NumFour`, `Societe`, `Nom`, `Prenom`, `Adresse`, `CP`, `Ville`) VALUES
(1, 'Vitaminis ', 'Verlaine', 'Paul', 'rue de belgrade 96', 1147, 'BRUXELLES'),
(2, 'CORA SA', 'Fawat', 'Pierre', 'Drève Olympique 15', 1070, 'BRUXELLES'),
(3, 'CARREFOUR BELGIUM SA (siège social)', 'Gasthuys', 'Jules', 'Avenue des Olympiades 20', 1140, 'BRUXELLES'),
(4, 'DELHAIZE Le Lion (siège social) ', 'Halasi', 'Chloé', ' Rue Osseghem 53', 1080, 'Bruxelles'),
(5, 'MATCH SA (siège social) ', 'Herbrandt ', 'Maëlys', 'route de Gosselies 408', 6220, 'FLEURUS '),
(6, 'LDL (siège social) ', 'Hinckel', 'Tom', 'Guldensporenpark 98', 9820, 'MERELBEKE'),
(7, 'COLRUYT SA (siège social)', 'Houvenaghel', 'Angele', 'Edingensesteenweg 196', 1500, 'HALLE'),
(8, 'DE LOCHTING', 'Jacob', 'Benjamin', 'Oude stadenstraat 15', 8800, 'ROESELARE'),
(9, 'BIO FRESH ', 'Janssens', 'Flavie', 'Berkenhoekstraat 20', 2861, 'Onze-Lieve-Vrouw-Waver'),
(10, 'DEN DIEPEN BOOMGAARD BIOBOERDERIJ', 'Jongers', 'Gael', 'Rijkenhoekstraat 80', 1850, 'GRIMBERGEN'),
(11, 'FRESHO', 'Pirodon', 'William', 'Rue de Plomcot 4 ', 6224, 'WANFERCEE-BAULET'),
(12, 'FRUIT ON WHEELS ', 'Piron', 'Brianna', 'Noormannenstraat  9', 3000, 'Leuven'),
(13, 'FRUITBOX@WORK', 'Pierre', 'Charles', 'lenniksestraat 53', 1755, 'OETINGEN'),
(14, 'FRULERO BVBA', 'D\'Oultremont', 'Jordan', 'Z.4 Broekooi 102', 1730, 'ASSE'),
(15, 'Labelle Verte ', 'Collard', 'Chloe', 'Rue de Ferrière 3A', 1470, 'BOUSVAL'),
(16, 'LA FINCA', 'Mouly', 'Sebastian', 'chaussée de Malines 71', 1970, 'WEZEMBEEK-OPPEM '),
(17, 'Sinature NV', ' Mathieu', 'Charles', 'Heiken 58', 2861, 'Onze-Lieve-Vrouw-Waver'),
(18, 'TORENHOF', 'Mathonat', 'Mary', 'Brussegemkerkstraat  1', 1785, 'BRUSSEGEM '),
(19, 'VANDER ZIJPEN N.V.', 'Musinkete', 'christine', 'Z.4 Broekooi 103', 1730, 'ASSE '),
(20, 'S.A. PASTIFICIO DELLA MAMMA ', 'Mombel', 'Romuald', ' Z I des Hauts-Sarts 4ème Avenue, 35 - B', 4040, 'Herstal '),
(21, 'Probel Group SA', 'Kouwe ', 'Marie', 'Rue des Primeurs 61/63', 1190, 'Bruxelles'),
(22, 'BISCUITERIE BRICHARD ', 'Mwary ', 'Marianne', 'rue Guillaume Fouquet 28 - Z.I.', 5032, 'Isnes'),
(23, 'VANPARYS - CANDIHOLD ', 'Sottiaux', 'Jean', 'Avenue Léon Grosjean 90 ', 1140, 'Bruxelles'),
(24, '  Confiseries Philippe', 'Mombel', 'Remy', 'Groot-Bijgaardenstraat, 15', 1600, 'Sint-Pieters-Leeuw'),
(25, 'WAFFLE FACTORY Rue des digitales, 2 7522 Marquain', 'Baboule', 'Patrick', 'Rue des digitales, 2', 7522, 'Marquain'),
(26, 'MAYA FAIR TRADE Rue de la Fagne 6 4920 Harze', 'Kouwe', 'Verlaine', 'Rue de la Fagne 6', 4920, 'Harze'),
(27, ' SODEBS', 'Bayang', 'Augustine', 'Rue Grégoire Jurion 18', 7120, 'Vellereille-Les-Brayeux'),
(28, 'LA COOKISERIE NAMUROISE', 'Soual', 'Valentine', 'BOULEVARD DE L\'HERBATTE 111', 5000, 'Namur'),
(29, 'TERROIR AT HOME', 'Mombel', 'André', 'Pavé d\'Ath 58', 7830, 'Bassilly'),
(30, 'BIRKENHOF', 'Van Der Straeten', 'Renaud', 'Marktplatz 16', 4750, 'Butgenbach'),
(31, 'TERRA TAVOLA', 'Nombock', 'Cyril', 'August Detréstraat 97', 1600, 'Sint-pieters-leeuw'),
(32, 'BUZZZ', 'Mombel', 'Elodie', 'Avenue Antoon Van Oss 1/17', 1120, 'Bruxelles'),
(33, 'I.F.KO. Rue Bourgogne 54 4452 Wihogne', 'Mondele', 'Margot', 'Rue Bourgogne 54', 4452, 'Wihogne'),
(34, 'AQUA GREEN CONSULT', 'Nobessondj', 'Emilienne', 'Rue Hubin 2b', 1300, 'Limal'),
(35, 'GERNAL', 'Boutoundi', 'Mireille', 'Chemin des casernes 12-14', 7780, 'Comines'),
(36, 'ALAMBIQUE', 'Koumbom', 'Mabelle', 'Rue du Grand Péril G10', 7090, 'Braine-Le-Comte'),
(37, 'FABROCA', 'Ndewe', 'Lovet', 'Ferme du bois de Remont', 5370, 'Porcheresse'),
(38, ' ALLAERT MEAT PRODUCTS', 'Edimo', 'Emmanuel', 'Rue du Compas, 55-63', 1070, 'Bruxelles'),
(39, 'SALAISONS SALAMONE', 'Jansoon', 'Angel', 'Rue de l\'Agace 25', 7061, 'Casteau'),
(40, 'MAYEKAWA EUROPE', 'Quinet', 'Jacqueline', 'Leuvensesteenweg 605', 1930, 'Zaventem'),
(41, 'VERBIST VIANDE DE BASTOGNE', 'Jaquine', 'Gabrielle', 'Rue Des Abattoirs 6', 6600, 'Bastogne'),
(42, 'ALLEUR EMBALL', 'Jardonnet', 'Marc', 'Rue des Technologies 2 B', 4432, 'Alleur'),
(43, 'TERRA TAVOLA', 'Janssen', 'Stijn', ' August Detréstraat 97', 1600, 'Sint-pieters-leeuw'),
(44, 'VANPARYS - CANDIHOLD', 'Jacques', 'Aaron', 'Avenue Léon Grosjean 90', 1140, 'Bruxelles'),
(45, 'OREIKO POWER EQUIPMENT', 'Jacquenod', 'Nathaniel', 'Hendrik I lei 56-58', 1800, 'Vilvoorde'),
(46, 'PHYTOWEBAROM', 'Jacobin', 'Marie', 'Rue Gilles Demarteau 17', 4000, 'Liège'),
(47, 'BIO NEUF', 'Jacmart', 'Richard', ' 162 rue du Corby', 6110, 'Montigny-Le-Tilleul'),
(48, 'PROTELUX', 'Huygens', 'Danielle', 'rue du Grand Enclos 34', 6880, 'Nevraumont'),
(49, 'COEUR D\'ESSENCES', 'Huart', 'Emelyne', '24 rue jenneval', 6040, 'Jumet'),
(50, 'LIPIDINE', 'Grégoire', 'Ella', 'Boulevard Initialis 13', 7000, 'Mons'),
(51, 'PERE OLIVE', 'Goslin', 'Tristan', ' Rue De Géron 43', 5300, 'Seilles');

-- --------------------------------------------------------

--
-- Structure de la table `lignevente`
--

CREATE TABLE `lignevente` (
  `NumVente` int(11) NOT NULL,
  `CodeProd` bigint(20) NOT NULL,
  `Quantité` double NOT NULL,
  `Prix` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `lignevente`
--

INSERT INTO `lignevente` (`NumVente`, `CodeProd`, `Quantité`, `Prix`) VALUES
(2, 110012548025, 2, 2.4),
(6, 110012548025, 6, 7.199999999999999),
(7, 111111111111, 3, 159),
(6, 111111141121, 3, 600),
(7, 111119111112, 3, 1563),
(2, 111222147852, 4, 480),
(2, 333666321123, 10, 32140);

-- --------------------------------------------------------

--
-- Structure de la table `produits`
--

CREATE TABLE `produits` (
  `CodeProd` bigint(12) NOT NULL,
  `NumFour` int(11) NOT NULL,
  `Designation` varchar(50) NOT NULL,
  `Prix` double NOT NULL,
  `Stock` double NOT NULL,
  `StockMin` double NOT NULL,
  `DernArrivage` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `produits`
--

INSERT INTO `produits` (`CodeProd`, `NumFour`, `Designation`, `Prix`, `Stock`, `StockMin`, `DernArrivage`) VALUES
(110012548025, 12, 'Biscuits', 1.2, 524, 156, '2020-06-16'),
(110112548025, 7, 'Vins rouges', 21.63, 100, 120, '2020-06-27'),
(111111111111, 8, 'Filtres à café', 53, 2147.36, 637, '2020-07-16'),
(111111111112, 16, 'Vins blancs', 54, 90, 100, '2020-06-16'),
(111111141121, 9, 'Eau pétillante saveur menthe', 200, 102, 125, '2020-05-31'),
(111119111112, 15, 'Bissap', 521, 120, 321, '2020-06-30'),
(111221121136, 12, 'Choux fleur', 98.65, 45, 120, '2020-07-06'),
(111222147852, 11, 'Yaourts', 120, 50, 110, '2020-06-27'),
(111231654111, 12, 'Pommes', 300, 10, 100, '2020-07-07'),
(111231654212, 14, 'Pamplemousse', 954.84, 20, 100, '2020-08-06'),
(123321456654, 15, 'Poireaux', 250, 12, 180, '2020-07-01'),
(123654789635, 18, 'Dentrifrice', 1000, 1000, 326, '2020-05-30'),
(125480254101, 9, 'Aubergines', 523.65, 90, 100, '2020-05-11'),
(125480254229, 14, 'Avocats', 354, 10, 160, '2020-06-21'),
(125480255663, 1, 'Tomates', 632.2, 45, 120, '2020-05-03'),
(125480255667, 2, 'Céréales', 240, 1023, 632, '2020-06-30'),
(125481255697, 18, 'Kiwi', 215.98, 45, 120, '2020-06-30'),
(145480254002, 6, 'Poulets', 302.52, 100, 100, '2020-08-19'),
(200000000001, 51, 'Chocolat', 6.25, 456, 130, '2020-06-09'),
(200000000002, 49, 'Huile arbre à thé', 4.25, 600, 110, '2020-06-26'),
(200000000004, 2, 'boissons soft', 3.6, 412, 200, '2020-06-14'),
(200000000006, 10, 'Anchois en conserve', 5.98, 130, 100, '2020-06-30'),
(200000000007, 11, 'Miles de fleur', 4.32, 300, 150, '2020-05-10'),
(200323125654, 4, 'Poireaux', 62.36, 90, 201, '2020-06-15'),
(270899895362, 28, 'Cookies aux chocolat', 10.36, 253, 165, '2020-06-01'),
(333112548025, 15, 'Vins Mousseux', 152.14, 100, 659, '2020-06-24'),
(333112548026, 5, 'Gels de douche', 289.34, 152, 1100, '2020-06-30'),
(333222654147, 9, 'ciboulette', 50, 30, 100, '2020-06-26'),
(333666321123, 17, 'Café soluble', 3214, 102, 658, '2020-06-27'),
(340012548025, 6, 'Saucisses', 985.36, 1178, 120, '2020-09-22'),
(410013153122, 39, 'Saucissons Secs', 6.45, 145, 120, '2020-05-19'),
(463285417954, 17, 'Lait', 1000, 90, 120, '2020-06-15'),
(511258036410, 47, 'Lait bio', 3.74, 160, 100, '2020-06-09'),
(563285417896, 24, 'Bonbons à la rhubarbe', 9.2, 1000, 250, '2020-01-19'),
(565412777148, 34, 'Café en grain ', 7.85, 178, 145, '2020-06-14'),
(599801005159, 32, 'Huile d\'olive', 8.25, 300, 120, '2020-03-09'),
(620001532141, 50, 'Pistaches salées', 4.56, 200, 160, '2020-02-04'),
(637666591230, 20, 'Chips salées', 0.99, 652, 200, '2020-06-27'),
(777951252634, 9, 'Tomates', 78.36, 90, 654, '2020-08-13'),
(785951456365, 25, 'Capellini', 2.36, 652, 200, '2020-06-22'),
(800554714256, 16, 'Poudre à lessive', 700, 250, 264, '2020-05-10'),
(806547414255, 19, 'Fromages', 254, 23, 100.36, '2020-07-30'),
(806547414256, 9, 'Mangues', 265, 4124, 236, '2020-07-24'),
(807054714256, 1, 'Oranges', 653.85, 2301, 256, '2020-05-10'),
(822054714259, 35, 'Papier toilette', 2.36, 10000, 500, '2020-02-29'),
(842254794265, 15, 'Laitue', 220, 114, 100, '2020-06-30'),
(842254794266, 14, 'Pêches en conserve', 250, 158, 120, '2020-06-25'),
(895000141775, 22, 'Galettes bretonnes', 3.54, 110, 110, '2020-06-30'),
(900256541003, 12, 'Noix de pécan', 5.14, 250, 123, '2020-01-22'),
(963258741112, 1, 'Tomates', 63.2, 90, 120, '2020-06-27'),
(963369569354, 7, 'pommes de terre', 1.36, 100000, 1000, '2020-06-01');

--
-- Déclencheurs `produits`
--
DELIMITER $$
CREATE TRIGGER `VerifierStockMin` BEFORE INSERT ON `produits` FOR EACH ROW BEGIN
  IF NEW.StockMin < 100 THEN 
    SIGNAL SQLSTATE '02000' SET MESSAGE_TEXT = 'Warning: stock insuffisant(<100), veuillez commander chez le fournisseur!';
  END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Structure de la table `ventes`
--

CREATE TABLE `ventes` (
  `NumVente` int(11) NOT NULL,
  `NumCli` int(11) NOT NULL,
  `Date` date NOT NULL,
  `Total` double NOT NULL,
  `Paye` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `ventes`
--

INSERT INTO `ventes` (`NumVente`, `NumCli`, `Date`, `Total`, `Paye`) VALUES
(2, 5, '2020-06-30', 32622.4, 1),
(6, 10, '2020-06-02', 412.36, 0),
(7, 3, '2020-06-21', 41.02, 1),
(12, 7, '2020-06-21', 6329.01, 0),
(14, 5, '2020-06-02', 220.3, 0),
(16, 4, '2020-06-02', 526, 1),
(18, 8, '2020-06-21', 542.36, 0),
(20, 1, '2020-06-04', 45.2, 0),
(22, 60, '2020-06-05', 635.9, 0),
(23, 6, '2020-06-08', 5478.2, 1),
(24, 51, '2020-06-08', 9685.53, 1),
(26, 60, '2020-06-08', 156.38, 1),
(27, 6, '2020-06-08', 123.68, 1),
(28, 8, '2020-06-08', 546.98, 1),
(30, 4, '2020-06-27', 2650, 1),
(31, 71, '2020-06-22', 6987.3, 1),
(32, 50, '2020-07-15', 2365, 0),
(33, 13, '2020-07-23', 478, 1),
(34, 65, '2020-05-03', 652.02, 1),
(35, 1, '2020-06-10', 56.25, 0),
(36, 1, '2020-06-10', 0, 0),
(37, 8, '2020-06-10', 0, 1),
(38, 1, '2020-06-10', 63.59, 0);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`NumCli`);

--
-- Index pour la table `fournisseurs`
--
ALTER TABLE `fournisseurs`
  ADD PRIMARY KEY (`NumFour`);

--
-- Index pour la table `lignevente`
--
ALTER TABLE `lignevente`
  ADD PRIMARY KEY (`CodeProd`,`NumVente`),
  ADD KEY `NumVente` (`NumVente`);

--
-- Index pour la table `produits`
--
ALTER TABLE `produits`
  ADD PRIMARY KEY (`CodeProd`),
  ADD KEY `NumFour` (`NumFour`);

--
-- Index pour la table `ventes`
--
ALTER TABLE `ventes`
  ADD PRIMARY KEY (`NumVente`),
  ADD KEY `NumCli` (`NumCli`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `clients`
--
ALTER TABLE `clients`
  MODIFY `NumCli` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `fournisseurs`
--
ALTER TABLE `fournisseurs`
  MODIFY `NumFour` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=52;

--
-- AUTO_INCREMENT pour la table `ventes`
--
ALTER TABLE `ventes`
  MODIFY `NumVente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `lignevente`
--
ALTER TABLE `lignevente`
  ADD CONSTRAINT `lignevente_ibfk_1` FOREIGN KEY (`NumVente`) REFERENCES `ventes` (`NumVente`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `lignevente_ibfk_2` FOREIGN KEY (`CodeProd`) REFERENCES `produits` (`CodeProd`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `produits`
--
ALTER TABLE `produits`
  ADD CONSTRAINT `produits_ibfk_1` FOREIGN KEY (`NumFour`) REFERENCES `fournisseurs` (`NumFour`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `ventes`
--
ALTER TABLE `ventes`
  ADD CONSTRAINT `ventes_ibfk_1` FOREIGN KEY (`NumCli`) REFERENCES `clients` (`NumCli`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
