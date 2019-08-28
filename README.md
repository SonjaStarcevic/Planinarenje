# Planinarenje

Tekst zadatka:

Planina ima ime i visinu (u metrima).
Moze da sesastavi tekstualni opis u obliku ime(visina),
kao i tekstualni opis niza planina u obliku planina, planina, ..., planina.
Planinar ima ime, jedinstveni celobrojni identifikacioni broj i zbirku
planina zadatog kapaciteta, pri cemu se za svaku planinu na koju se planinar popeo pamti i
odgovarajuci datum. Zbirka se stvara prazna, nakon cega planine mogu da se dodaju
jedna po jedna. Planinar moze da se penje po zadatoj planini. Penjanje treba da vrati
indikator uspesnosti (true/false). Ukoliko je penjanje bilo uspesno, zadata planina se
stavlja u zbirku planina i vraca se true. Ukoliko je penjanje bilo neuspesno vraca se false.
Moze da se sastavi tekstualni opis planinara u obliku ime-identifikator(planina,
planina, ..., planina).
Klasicni planinar je planinar koji se penje po planinama nizim od 2000m, inace je
penjanje neuspesno. Tekstualni oblik je K_ime-ident(planina, planina, ..., planina).
Alpinista je planinar kome može da se dodeli drugi alpinista kao partner i koji se penje
po planinama visim od 3000m. Partner ne moze da bude klasicni planinar. Ukoliko
alpinista nema dodeljenog partnera ili je planina niza od 3000m, penjanje je neuspesno.
Tekstualni opis je A_ime-ident(planina, planina, ..., planina).
Planinarsko društvo ima naziv, godinu osnivanja i listu planinara. Stvara se
sa nepraznom listom planinara (osnivaca). Planinar moze da se uclani, pri cemu se dodaje
na kraj liste. Moze da se dohvati planinar sa zadate pozicije u listi (pozicije idu od 1) i
da se dohvati ukupan broj planinara u listi. Omoguciti i rangiranje clanova na osnovu zbira
visina svih planina na koje se popeo, pri cemu za planine vise od 1800m na zbir dodati jos
300m. U obzir uzimati samo ture koje su se odrzale u poslednjih mesec dana (dakle, u odnosu
na datum pokretanja programa).
Tekstualni opis sadrzi opis svakog
planinara u posebnom redu.
Glavna test metoda treba da napravi dve planine, Mont Blan
visine 4807m i Zlatibor visine 1496m, a zatim planinarsko drustvo sa zadatim alpinistom
i klasicnim planinarom. Zatim se planinarskom drustvu dodaju jos jedan alpinista i jos
jedan klasièni planinar. Nakon toga se prvom planinaru u drustvu zada da se penje na Mont
Blan, a drugom da se penje na Zlatibor. Zatim se prvom planinaru u društvu dodeli treci
planinar kao partner i obrnuto i oba planinara se posalju na Mont Blan. Posle svakog slanja
na planinu na standardnom izlazu se ispise planinar, planina i status uspeha penjanja. Na
kraju se prikaze planinarsko drustvo na standardnom izlazu kao i rang lista clanova.