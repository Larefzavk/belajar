<?php
$conn = mysqli_connect("localhost", "root", "", "belajar");	
function query($query){
	global $conn;
	$result = mysqli_query($conn, $query);
	$rows = [];
	while( $row = mysqli_fetch_assoc($result)){
		$rows[] = $row;
	}
	return $rows;
}
function tambah($tambah){
	//ambil tambah dari tiap elemen dalam form
	global $conn;
	$kode_guru = htmlspecialchars($tambah["kode_guru"]);
	$nama_guru = htmlspecialchars($tambah["nama_guru"]);
	$hari = htmlspecialchars($tambah["hari"]);
	$mapel = htmlspecialchars($tambah["mapel"]);
	$waktu = htmlspecialchars($tambah["waktu"]);

	//query insert data
	$query = "INSERT INTO belajar1
		VALUES
	('', '$kode_guru', '$nama_guru', '$hari', '$mapel', '$waktu')
	";
	mysqli_query($conn, $query);

	return mysqli_affected_rows($conn);

}
?>