;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Council Regions
(def councils
  {
   "Adelaide Hills Council"                 {:wikidata "Q353997"}
   "City of Adelaide"                       {:wikidata "Q1094063"}
   "City of Burnside"                       {:wikidata "Q1016835"}
   "City of Campbelltown"                   {:wikidata "Q1030580"}
   "City of Charles Sturt"                  {:wikidata "Q1066185"}
   "City of Holdfast Bay"                   {:wikidata "Q1624414"}
   "City of Marion"                         {:wikidata "Q1812769"}
   "City of Mitcham"                        {:wikidata "Q1279553"}
   "City of Norwood, Payneham & St Peters"  {:wikidata "Q56477743"}
   "City of Onkaparinga"                    {:wikidata "Q1812778"}
   "City of Playford"                       {:wikidata "Q976355"}
   "City of Port Adelaide Enfield"          {:wikidata "Q1533526"}
   "City of Prospect"                       {:wikidata "Q1537228"}
   "City of Salisbury"                      {:wikidata "Q947334"}
   "City of Tea Tree Gully"                 {:wikidata "Q2062776"}
   "City of Unley"                          {:wikidata "Q1766439"}
   "City of West Torrens"                   {:wikidata "Q1813391"}
   "Town of Gawler"                         {:wikidata "Q1847617"}
   "Town of Walkerville"                    {:wikidata "Q1521840"}
   }

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Bus Terminus
(def terminus
  {
   :sellicks-beach-gulfview ["Sellicks Beach, Gulfview Road"          "146"]
   :sellicks-beach-perth    ["Sellicks Beach, Perth St"               "137"]
   :aldinga-shops           ["Aldinga Shopping Centre, Rowley Rd"     "117"]
   :aldinga-beach           ["Aldinga Beach, John Nicholl Reserve"    "124"]
   :port-willunga           ["Port Willunga, Quinliven Rd"            "113"]
   :maslin-beach            ["Maslin Beach, Gulf Pde"                  "97"]
   :willunga                ["Willunga, St Andrews Tce"               "97C"]
   :mclaren-flat            ["McLaren Flat, Oakley Rd"                 "98"]
   :mclaren-vale            ["McLaren Vale, main Road"                 "92"]
   :seaford-centre          ["Seaford Centre, The Pde"                 "85"]
   :seaford                 ["Seaford, Grand Bvd"                     "84B"]
   :seaford-interchange     ["Seaford Interchange"                       ""]
   :noarlunga-interchange   ["Noarlunga Centre Interchange"              ""]
   :noarlunga-hospital      ["Noarlunga Hospital, Alexander Kelly Dr" "64A"]
   :colonades-interchange   ["Colenades Centre Interchange"              ""]
   }
  )

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Routes

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Route Numbers

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(def routes {})
(def routes-status
  {
   ;; East West
   "100"  {}
   "101"  {}
   "106"  {}
   "110"  {}
   "112"  {}
   "115"  {}
   "117"  {}
   "118"  {}
   "140"  {}
   "141"  {}
   "142"  {}
   "144"  {}
   "147"  {}
   "150"  {}
   "155"  {}
   "157"  {}
   "163"  {}
   "167"  {}
   "168"  {}
   "170"  {}
   "171"  {}
   "172"  {}
   "173"  {}
   "174"  {}
   "176"  {}
   "178"  {}
   "190"  {}
   "195"  {}
   "196"  {}
   "197X" {}
   "230"  {}
   "232"  {}
   "281"  {}
   "286"  {}
   "287"  {}
   "288"  {}
   "333"  {}
   "371"  {}
   "372"  {}
   "376"  {}
   "579"  {}
   "580"  {}
   "H20"  {}
   "H21"  {}
   "H22"  {}
   "H23"  {}
   "H24"  {}
   "H30"  {}
   "H32"  {}
   "H33"  {}
   "H33"  {}
   "J1"   {}
   "J1X"  {}
   "J2"   {}
   "J7"   {}
   "J8"   {}
   "N22"  {}
   "N30"  {}
   "N178" {}
   "W90"  {}
   "W91"  {}
   "X30"  {}
   ;; North South
   "200"  {}
   "202"  {}
   "203"  {}
   "206"  {}
   "208"  {}
   "209F" {}
   "235"  {}
   "238"  {}
   "239"  {}
   "241"  {}
   "245"  {}
   "248"  {}
   "251"  {}
   "252"  {}
   "253"  {}
   "254"  {}
   "262"  {}
   "263"  {}
   "265"  {}
   "271"  {}
   "273"  {}
   "300"  {}
   "320"  {}
   "361"  {}
   "528"  {}
   "600"  {}
   "601"  {}
   "605"  {}
   "645"  {}
   "646"  {}
   "G10"  {}
   "G20"  {}
   "G21"  {}
   "G22X" {}
   "G30F" {}
   "G40"  {}
   "M44"  {}
   "N10"  {}
   "N21"  {}
   "N262" {}
   "N202" {}
   "N254" {}
   ;; Outer North
   "222"  {}
   "224"  {}
   "225"  {}
   "228"  {}
   "229"  {}
   "400"  {}
   "401"  {}
   "403"  {}
   "404"  {}
   "405"  {}
   "411"  {}
   "415"  {}
   "421"  {}
   "430"  {}
   "440"  {}
   "441"  {}
   "442"  {}
   "443"  {}
   "451"  {}
   "452"  {}
   "461"  {}
   "462"  {}
   "491"  {}
   "492A" {}
   "492C" {}
   "493"  {}
   "494"  {}
   "560"  {}
   "565"  {}
   "566"  {}
   "900"  {}
   "N224" {}
   ;; Outer North East
   "500"  {}
   "501"  {}
   "502"  {}
   "503"  {}
   "506"  {}
   "507"  {}
   "528"  {}
   "530"  {}
   "540"  {}
   "541"  {}
   "542"  {}
   "543"  {}
   "544"  {}
   "545"  {}
   "546"  {}
   "548"  {}
   "556"  {}
   "557"  {}
   "559"  {}
   "578"  {}
   "591A" {}
   "591C" {}
   "C1"   {}
   "C2"   {}
   "G40"  {}
   "J1"   {}
   "J2"   {}
   "M44"  {}
   "N1"   {}
   "N502" {}
   "N541" {}
   "N542" {}
   ;; Outer South
   "640"  {}
   "681"  {}
   "682"  {}
   "683"  {}
   "719"  {}
   "720"  {}
   "721"  {}
   "722"  {}
   "723F" {}
   "723X" {}
   "725"  {}
   "733"  {}
   "734"  {}
   "737"  {}
   "741"  {}
   "743"  {}
   "744"  {}
   "745"  {}
   "747"  {}
   "750"  {:josn-route :done
           :josm-stops :todo
           :check-gtfs :todo}
   "751"  {}
   "752"  {}
   "755"  {}
   "756"  {}
   "N721" {}
   ;; Hills
   "820"  {}
   "821"  {}
   "822"  {}
   "823"  {}
   "830F" {}
   "834"  {}
   "835"  {}
   "837"  {}
   "838"  {}
   "839"  {}
   "840X" {}
   "841F" {}
   "842X" {}
   "850"  {}
   "852"  {}
   "860F" {}
   "861"  {}
   "863"  {}
   "864"  {}
   "865"  {}
   "866"  {}
   "892"  {}
   "893"  {}
   "894"  {}
   "N864" {}
   "T840" {}
   "T842" {}
   "T843" {}
   "T863" {}
   })
