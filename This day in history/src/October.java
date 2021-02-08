import java.util.Random;

public class October {
	Random ran = new Random();

	October(int date) {
		
		System.out.println();
		System.out.println(date+ ". " + "Oktobra notikums:");
		System.out.println();
		
		switch (date) {
		case 1:
			String[] okt1 = { "1890. — ASV dibināts Josemitu nacionālais parks.",
					"1946. — darbu beidza Nirnbergas starptautiskais kara tribunāls.",
					"1949. — tika proklamēta Ķīnas Tautas Republika." };
			int random1 = ran.nextInt(okt1.length);
			System.out.println(okt1[random1]);
			
			break;
		case 2:
			String[] okt2 = { "1990. — beidza pastāvēt Vācijas Demokrātiskā Republika.",
					"1870. — Romā notika plebiscīts, pēc kura Roma un Latija tika pievienota Itālijas Karalistei.",
					"1865. — Latgalē stājās spēkā aizliegums iespiest grāmatas ar latīņu burtiem, aizsākot cara valdības rusifikācijas politiku." };
			int random2 = ran.nextInt(okt2.length);
			System.out.println(okt2[random2]);

			break;
		case 3:
			String[] okt3 = { "1906. — SOS oficiāli tika atzīts par starptautisko nelaimes signālu.",
					"1932. — Irāka ieguva neatkarību no Apvienotās Karalistes.",
					"1942. — pirmais veiksmīgais V-2 (A4) raķetes starts Vācijā, pirmoreiz cilvēka veidots objekts sasniedza kosmosu." };
			int random3 = ran.nextInt(okt3.length);
			System.out.println(okt3[random3]);

			break;
		case 4:
			String[] okt4 = { "1535. — Bībele pirmoreiz nodrukāta angļu valodā.",
					"1957. — PSRS palaists pirmais Zemes mākslīgais pavadonis (Sputnik-1).",
					"1883. — atklāta vilcienu satiksmes līnija Austrumu ekspresis, kas savienoja Parīzi ar Stambulu." };
			int random4 = ran.nextInt(okt4.length);
			System.out.println(okt4[random4]);

			break;
		case 5:
			String[] okt5 = { "1507. — Kristofors Kolumbs atklāja Kostariku.",
					"1910. — Portugālē deklarēta republika; karalis aizbēg uz Apvienoto Karalisti.",
					"2000. — Dienvidslāvijas prezidents Slobodans Miloševičs pameta savu posteni pēc plašām protesta demonstrācijām Serbijā." };
			int random5 = ran.nextInt(okt5.length);
			System.out.println(okt5[random5]);

			break;
		case 6:
			String[] okt6 = { "1934. — Katalonijas separātistu dumpis.",
					"1939. — Otrais pasaules karš: sakautas pēdējās Polijas armijas vienības.",
					"1995. — paziņots par pirmās citplanētas (51 Pegasi b) atklāšanu." };
			int random6 = ran.nextInt(okt6.length);
			System.out.println(okt6[random6]);

			break;
		case 7:
			String[] okt7 = { "1920. — Lietuva un Polija noslēdza Suvalku līgumu.",
					"1977. — PSRS pieņēma jaunu konstitūciju.",
					"2001. — ASV ar Apvienotās Karalistes spēku piedalīšanos iebruka Afganistānā." };
			int random7 = ran.nextInt(okt7.length);
			System.out.println(okt7[random7]);

			break;
		case 8:
			String[] okt8 = { "1892. — Edmontonai Kanādā piešķīra pilsētas tiesības.",
					"1919. — Latvijas brīvības cīņas: bermontieši sāka uzbrukumu Rīgai.",
					"1988. — dibināta Latvijas Tautas fronte." };
			int random8 = ran.nextInt(okt8.length);
			System.out.println(okt8[random8]);

			break;
		case 9:
			String[] okt9 = { "1804. — dibināta Tasmanijas galvaspilsēta Hobārta.", "1920. — Polija okupēja Viļņu.",
					"2006. — Ziemeļkoreja paziņoja, ka tā veikusi savu pirmo kodolsprādzienu." };
			int random9 = ran.nextInt(okt9.length);
			System.out.println(okt9[random9]);

			break;
		case 10:
			String[] okt10 = { "1868. — Kuba deklarēja neatkarību no Spānijas.",
					"1939. — starp Lietuvu un PSRS parakstīts līgums, kurā Lietuva atguva Viļņas apgabalu.",
					"1970. — Fidži ieguva neatkarību no Apvienotās Karalistes." };
			int random10 = ran.nextInt(okt10.length);
			System.out.println(okt10[random10]);

			break;
		case 11:
			String[] okt11 = { "1986. — Reikjavikā tikās ASV un PSRS vadītāji Ronalds Reigans un Mihails Gorbačovs.",
					"1944. — PSRS anektēja Tivas Tautas Republiku.", "1899. — sākās Angļu—būru karš." };
			int random11 = ran.nextInt(okt11.length);
			System.out.println(okt11[random11]);

			break;
		case 12:
			String[] okt12 = {
					"1960. — ANO ģenerālās asamblejas laikā PSRS vadītājs Ņikita Hruščovs esot pārtraucis britu premjerministra runu, ar kurpi sitot pa galdu.",
					"1964. — PSRS palaists kosmosa kuģis Voshod-1 ar pirmo pasaulē 3 cilvēku apkalpi.",
					"2005. — Ķīnā palaists 2. pilotētais kosmosa kuģis Shenzhou 7." };
			int random12 = ran.nextInt(okt12.length);
			System.out.println(okt12[random12]);

			break;
		case 13:
			String[] okt13 = { "1970. — Fidži pievienojas Apvienoto Nāciju Organizācijai.",
					"1946. — Francijā pieņemta Ceturtās Republikas konstitūcija.",
					"1944. — Otrais pasaules karš: Sarkanā armija ieņēma Rīgu." };
			int random13 = ran.nextInt(okt13.length);
			System.out.println(okt13[random13]);

			break;
		case 14:
			String[] okt14 = { "1947. — Čaks Jēgers lidmašīnā X-1 pirmoreiz sasniedza virsskaņas ātrumu.",
					"1964. — Leonīds Brežņevs kļuva par PSKP pirmo sekretāru pēc Ņikitas Hruščova atstādināšanas.",
					"1978. — Filipīnās sākās astotais Pasaules čempionāts basketbolā; par čempioniem kļuva Dienvidslāvijas izlase." };
			int random14 = ran.nextInt(okt14.length);
			System.out.println(okt14[random14]);

			break;
		case 15:
			String[] okt15 = {
					"1582. — Pāvests Gregors XIII ieviesa Gregora kalendāru; vairākās Eiropas valstīs 4. oktobrim sekoja 15. oktobris.",
					"1989. — Veins Greckis kļuva par visvairāk punktus guvušo spēlētāju NHL vēsturē.",
					"1990. — PSRS līderis Mihails Gorbačovs saņēma Nobela Miera prēmiju par viņa ieguldījumu aukstā kara sasprindzinājuma mazināšanā un valsts atvērtības palielināšanā." };
			int random15 = ran.nextInt(okt15.length);
			System.out.println(okt15[random15]);

			break;
		case 16:
			String[] okt16 = { "1923. — dibināta kinokompānija The Walt Disney Company.",
					"1929. — Tadžikijas APSR pārveidota par Tadžikijas PSR.",
					"1978. — par pāvestu kļuva polis Jānis Pāvils II (Karols Juzefs Voitila)." };
			int random16 = ran.nextInt(okt16.length);
			System.out.println(okt16[random16]);

			break;
		case 17:
			String[] okt17 = { "1610. — Reimsā kronēts Francijas karalis Luijs XIII.",
					"1918. — Ungārija pasludināja neatkarību no Austrijas.",
					"1931. — Als Kapone tika notiesāts par izvairīšanos no ienākuma nodokļa maksāšanas." };
			int random17 = ran.nextInt(okt17.length);
			System.out.println(okt17[random17]);

			break;
		case 18:
			String[] okt18 = { "1797. — beidza pastāvēt Venēcijas Republika.", "1922. — dibināta raidorganizācija BBC.",
					"1944. — Otrais pasaules karš: Sarkanā armija iegāja Čehoslovākijā." };
			int random18 = ran.nextInt(okt18.length);
			System.out.println(okt18[random18]);

			break;
		case 19:
			String[] okt19 = { "2000. — Ņujorkā atklāta Tiso kundzes Vaska figūru muzeja filiāle.",
					"1960. — ASV ieviesa embargo pret komunistisko Kubu.",
					"1935. — Tautu Savienība ieviesa ekonomiskās sankcijas pret fašistisko Itāliju par tās iebrukumu Etiopijā." };
			int random19 = ran.nextInt(okt19.length);
			System.out.println(okt19[random19]);

			break;
		case 20:
			String[] okt20 = { "1548. — dibināta Lapasa, viena no Bolīvijas galvaspilsētām.",
					"1971. — sabruka Nepālas vērtspapīru birža.",
					"1818. — ASV un Apvienotā Karaliste vienojās noteikt ASV un Kanādas robežu pa 49. paralēli." };
			int random20 = ran.nextInt(okt20.length);
			System.out.println(okt20[random20]);

			break;
		case 21:
			String[] okt21 = { "2002. — Irākas prezidents Sadams Huseins izsludināja vispārēju amnestiju.",
					"1986. — Māršala Salas ieguva neatkarību no ASV.",
					"1578. — Livonijas karš: Vendenes kaujā pie Cēsīm apvienotie zviedru-poļu-lietuviešu spēki sakāva Krievijas karaspēku." };
			int random21 = ran.nextInt(okt21.length);
			System.out.println(okt21[random21]);

			break;
		case 22:
			String[] okt22 = { "2008. — Indija palaida pirmo Mēness zondi Chandrayaan 1.",
					"1964. — franču rakstnieks un filozofs Žans Pols Sartrs atteicās no Nobela prēmijas.",
					"1950. — Argentīnas pilsētā Buenosairesā sākās pirmais Pasaules čempionāts basketbolā." };
			int random22 = ran.nextInt(okt22.length);
			System.out.println(okt22[random22]);

			break;
		case 23:
			String[] okt23 = { "1946. — Ņujorkā notika pirmā ANO Ģenerālās asamblejas sēde.",
					"2001. — Apple Computer izlaida iPod.",
					"1956. — Ungārijas revolūcija: Ungārijā sākās protesti pret propadomiski orientēto valdību." };
			int random23 = ran.nextInt(okt23.length);
			System.out.println(okt23[random23]);

			break;
		case 24:
			String[] okt24 = { "2007. — Ķīna palaida savu pirmo Mēness zondi Chang'e 1.",
					"1946. — ASV palaistā raķete V-2 pirmoreiz nofotografēja Zemi no kosmosa.",
					"1945. — dibināta Apvienoto Nāciju Organizācija." };
			int random24 = ran.nextInt(okt24.length);
			System.out.println(okt24[random24]);

			break;
		case 25:
			String[] okt25 = { "1962. — Uganda pievienojās Apvienoto Nāciju Organizācijai.",
					"1992. — Lietuvā referendumā pieņemta jauna konstitūcija.",
					"2001. — Microsoft izlaida Windows XP." };
			int random25 = ran.nextInt(okt25.length);
			System.out.println(okt25[random25]);

			break;
		case 26:
			String[] okt26 = { "1905. — Norvēģija ieguva neatkarību no Zviedrijas.",
					"2012. — sākta operētājsistēmas Windows 8 pārdošana.",
					"1994. — Jordānija un Izraēla noslēdza miera līgumu." };
			int random26 = ran.nextInt(okt26.length);
			System.out.println(okt26[random26]);

			break;
		case 27:
			String[] okt27 = { "1939. — Lietuvas karaspēks ienāca Viļņā saskaņā ar PSRS un Lietuvas līgumu.",
					"1982. — Ķīna paziņoja, ka tās iedzīvotāju skaits pārsniedzis miljardu.",
					"1995. — Latvijas valdība iesniedza pieteikumu par iestāšanos Eiropas Savienībā." };
			int random27 = ran.nextInt(okt27.length);
			System.out.println(okt27[random27]);

			break;
		case 28:
			String[] okt28 = { "1918. — Čehoslovākija pasludināja neatkarību no Austroungārijas.",
					"1941. — Otrais pasaules karš: Kauņas geto, Lietuvā vācu SS spēki nogalināja ap 9000 ebreju.",
					"1962. — Kubas raķešu krīze: PSRS vadītājs Ņikita Hruščovs paziņoja, ka tiks izvāktas raķetes no Kubas." };
			int random28 = ran.nextInt(okt28.length);
			System.out.println(okt28[random28]);

			break;
		case 29:
			String[] okt29 = {
					"2004. — Eiropas Savienības valstu vadītāji Romā parakstīja līgumu par Eiropas Konstitūciju.",
					"1956. — IBM izveidoja pirmo cieto disku (5 MB).",
					"1929. — ar Ņujorkas biržas sabrukumu (“melnā otrdiena”) ASV sākās Lielā depresija." };
			int random29 = ran.nextInt(okt29.length);
			System.out.println(okt29[random29]);
			break;
		case 30:
			String[] okt30 = {
					"1983. — Argentīnā notika pirmās demokrātiskās vēlēšanas pēc 7 gadu militāras pārvaldes.",
					"1941. — Otrais pasaules karš: ASV prezidents Franklins Rūzvelts apstiprināja viena miljarda USD lendlīzes palīdzības sniegšanu Sabiedrotajiem.",
					"Cara bumba\n"
							+ "1905. (j.s., pēc v.s. 17. oktobrī) — Oktobra manifests: Krievijas cars Nikolajs II apstiprināja parlamenta izveidi.\n"
							+ "1918. — Pirmais pasaules karš: Osmaņu impērija noslēdza Mudrosas pamiera līgumu ar Antanti, līdz ar to beidzot karadarbību Tuvajos Austrumos." };
			int random30 = ran.nextInt(okt30.length);
			System.out.println(okt30[random30]);

			break;
		case 31:
			String[] okt31 = { "1866. — sākta Briseles Tiesu pils būvniecība.",
					"1957. — Japānas uzņēmums Toyota sāka eksportēt savas automašīnas uz ASV.",
					"1915. — Pirmais pasaules karš: britu karavīri pirmoreiz izmantoja tērauda bruņucepures." };
			int random31 = ran.nextInt(okt31.length);
			System.out.println(okt31[random31]);

			break;

		default:
			System.out.print("Oktobrī šāda datuma nav");
			break;
		}
	}

}
