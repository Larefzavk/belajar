<?php
require 'function.php';
$belajar1 = query("SELECT * FROM belajar1");
?>

<!DOCTYPE html>
<html>
<head>
	<title>Halaman Admin</title>
	
</head>
<body

<h1>Data Pelajaran</h1>
<a href="tambah.php">Tambah data</a>
<table border="1" cellpadding="10" cellspacing="0">
<tr>
<th>Id</th>
<th>Kode Guru</th>
<th>Nama Guru</th>
<th>Hari</th>
<th>Mapel</th>
<th>Waktu</th>
</tr>

<?php $i = 1; ?>
<?php foreach ( $belajar1 as $row) : ?>
<tr>
	<td><?= $i; ?></td>
<td><?= $row["kode_guru"]; ?></td>
<td><?= $row["nama_guru"]; ?></td>
<td><?= $row["hari"]; ?></td>
<td><?= $row["mapel"]; ?></td>
<td><?= $row["waktu"]; ?></td>

</tr>
<?php $i++; ?>
<?php endforeach; ?>
</table>
</body>
</html>