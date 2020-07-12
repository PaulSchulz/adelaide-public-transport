;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Resources
(def resources
  {"Adelaide Metro" "https://www.adelaidemetro.com.au/"
   "List of public transport routes in Adelaide" "https://en.wikipedia.org/wiki/List_of_public_transport_routes_in_Adelaide"
   "Public transport in Adelaide" "https://wiki.openstreetmap.org/wiki/Public_transport_in_Adelaide"
   "PTNA Analysis" "https://ptna.openstreetmap.de/resuylts/AU/SA/AU-SA-Adelaide-Metro-Analysis.html"
   }
  )

(def open-street-map
  {:errata ["Fix: Roundabout North/East of Marino Train Station"]
   })

(def status
  {:unknown       {:value       null
                   :color       "white"
                   :description "The details must be checked, status unknown"
                   :action      "Check"
                   :next        :complete
                   }
   :some          {:value       0
                   :color       "red"
                   :description "Contains little or no data"
                   :action      "Complete"
                   :next        :complete
                   }
   :partial       {:value       1
                   :color       "orange"
                   :description "Contains partial data"
                   :action      "Complete"
                   :next        :complete
                   }
   :most          {:value       2
                   :color       "yellow"
                   :description "Almost complete (describe what's missing"
                   :action      "Complete"
                   :next        :complete
                   }
   :complete      {:value       3
                   :color       "cyan"
                   :description "Complete (as a map)"
                   :action      "Check and correct errors"
                   :next        :verified
                   }
   :verified      {:value       4
                   :color       "green"
                   :description "Verified by 2 mappers. Indicate the date of the verification"
                   :action      "Update as required"
                   :next        :updated
                   }
   :updated       {:value       5
                   :color       "blue"
                   :description "Data has been updated"
                   :action      "Verify data"
                   :next        :verified
                   }
   :not-applicable {:value       "X"
                    :color       :cross
                    :description "The attribute does not exist in this area"
                    :action      "Update as needed"
                    :next        :complete
                    }
   :todo           {:value       -1
                    :color       "purple"
                    :description "Scheduled to be dome"
                    :action      "Update as needed"
                    :next        :complete
                    }
   })

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
  )
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Bus Terminus
(def terminus
  {
   ;; City
   :city-king-william-st      ["City, King William St"                   "B1"]
   :city-king-william-rd      ["City, King William Rd"                   "Z2"]
   ;; Outer South
   :sellicks-beach-gulfview   ["Sellicks Beach, Gulfview Road"          "146"]
   :sellicks-beach-perth      ["Sellicks Beach, Perth St"               "137"]
   :aldinga-shops             ["Aldinga Shopping Centre, Rowley Rd"     "117"]
   :aldinga-beach             ["Aldinga Beach, John Nicholl Reserve"    "124"]
   :port-willunga             ["Port Willunga, Quinliven Rd"            "113"]
   :maslin-beach              ["Maslin Beach, Gulf Pde"                  "97"]
   :willunga                  ["Willunga, St Andrews Tce"               "97C"]
   :mclaren-flat              ["McLaren Flat, Oakley Rd"                 "98"]
   :mclaren-vale              ["McLaren Vale, main Road"                 "92"]
   :seaford-centre            ["Seaford Centre, The Pde"                 "85"]
   :seaford                   ["Seaford, Grand Bvd"                     "84B"]
   :seaford-interchange       ["Seaford Interchange"                       ""]
   :noarlunga-interchange     ["Noarlunga Centre Interchange"              ""]
   :noarlunga-hospital        ["Noarlunga Hospital, Alexander Kelly Dr" "64A"]
   :colonades-interchange     ["Colenades Centre Interchange"              ""]
   :hallet-cove-interchange   ["Hallet Cove Interchange"                   ""]
   :old-reynella-interchange  ["Old Reynella Interchange"                  ""]
   :marino                    ["Marino, Newland Ave"                     "46"]
   :flinders-university       ["Flinders University, Registry Rd"          ""]
   :marion-centre-interchange ["Marion Centre Interchange"                 ""]
   ;; Hills
   :verdun                    ["Verdun, Mt Barker Rd"                    "49"]
   :mt-barker-dumas           ["Mount Barker, Dumas St Park ‘n’ Ride"      ""]
   :mt-barker-dutton          ["Mount Barker, Dutton Rd Park ‘n’ Ride"   "65"]
   :lobethal                  ["Lobethal, Ridge Rd"                      "76"]
   }
  )

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Timetables
(def timetables
  {
   :640-719-720
   {:routes      ["640" "719" "720" "720H"]
    :name        "Old Reynella, Marino & Flinders University to Marion Centre & City"
    :josm-routes :todo
    }
   :741-750-751-752-755-756
   {:routes ["741" "751A"
             "750" "750R" "750A" "750B" "750C" "750X"
             "751" "751A" "751C" "751H" "751R" "751W"
             "752"
             "755"
             "756"]
    :name "Southern Vales bus routes"
    :josm-routes :complete
    }
   :830F-834-835
   {:routes ["830F" "834" "835" "834A" "835A"]
    :name "Lobethal to Verdun, Mt Barker and City"
    josm-routes :complete
    }
   })

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
   "640"  {:name "Marion Centre Interchange to Marino"
           :josn-route :complete
           :josm-nstops :todo
           :check-gtfs :todo
           :color      "light-green"
           :errata-gtfs "Inbound: Stop 44 missed in GTFS"
           }
   "681"  {}
   "682"  {}
   "683"  {}
   "719"  {:name "Finders University to City"
           :josn-route :complete
           :josm-stops :todo
           :check-gtfs :todo
           :color      "light-blue"
           :errata-gtfs "In gtfs, Flinders stop (start) no in correct location."
           }
   "720"  {:name "Old Reynella to City"
           :josn-route :todo
           :josm-stops :todo
           :check-gtfs :todo
           :color      "light-green"
           :errata-gtfs ""
           }
   "720H"  {:name "Old Reynella to City via Finders Medical Centre"
            :josn-route :todo
            :josm-stops :todo
            :check-gtfs :todo
            :color      "light-green"
            :errata-gtfs ""
            }
   "721"  {}
   "722"  {}
   "723F" {}
   "723X" {}
   "725"  {}
   "733"  {}
   "734"  {}
   "737"  {}
   "741"  {:name "Maslin Beach to Noarlunga Centre Interchange"
           :josn-route :complete
           :josm-stops :todo
           :check-gtfs :todo
           :color      "cyan"
           :errata-gtfs "Turnaround at end of route 741 not mapped"
           }
   "741A" {:name  "Maslin Beach to Noarlunga Centre Interchange"
           :josn-route :complete
           :josm-stops :todo
           :check-gtfs :todo
           :color      "cyan"
           }
   "743"  {}
   "744"  {}
   "745"  {}
   "747"  {}
   "750"  {:josn-route :complete
           :josm-stops :todo
           :check-gtfs :todo
           :color      "red"
           }
   "750R"  {:josm-route :complete
            :josm-stops :todo
            :check-gtfs :todo
            :comment    "Multiple subroutes used"
            :color      "red"
            }
   "750A"  {:josm-route :complete
            :josm-stops :todo
            :check-gtfs :todo
            :comment    "Single direction"
            :color      "red"
            }
   "750B"  {:josm-route :complete
            :josm-stops :todo
            :check-gtfs :todo
            :comment    "Single direction"
            :color      "red"
            }
   "750C"  {:josm-route :complete
            :josm-stops :todo
            :check-gtfs :todo
            :comment    "Single direction"
            :color      "red"
            }
   "750X"{:josm-route :complete
          :josm-stops :todo
          :check-gtfs :todo
          :comment    "Single direction"
          :notes      "750X buses run express between Seaford Interchange and Aldinga Shopping Centre and service all stops between Aldinga Shopping Centre and Sellicks Beach."
          :color       "red"
          }
   "751"  {:josm-route :complete
           :josm-stops :todo
           :check-gtfs :todo
           :comment    ""
           :color      "yellow"
           :errata-gtfs ["Beach Road/Hunt Cres round-a-bout incorrectly located 50m East"
                         "Stop 81 Grand Blvd - West Side (18109) missing from inbound route"
                         "Stop 81 Grand Blvd - East side (18108) missing from outbound route"
                         "Outbond route misses Grand Blvd loop"]
           }
   "751A" {:josm-route :complete
           :josm-stops :todo
           :check-gtfs :todo
           :comment    ""
           :color      "yellow"
           :query-gtfs "Is loop around Grand Boulevard / South Pacific Dv correct?"
           }
   "751C" {:josm-route :complete
           :josm-stops :todo
           :check-gtfs :todo
           :comment    ""
           :color      "yellow"
           }
   "751H" {:josm-route :complete
           :josm-stops :todo
           :check-gtfs :todo
           :comment    ""
           :color      "yellow"
           }
   "751R" {:josm-route :complete
           :josm-stops :todo
           :check-gtfs :todo
           :comment    "Two routes towards Seaford"
           :color      "yellow"
           }
   "751W" {:josm-route :complete
           :josm-stops :todo
           :check-gtfs :todo
           :comment    "Routes terminate in Willunga"
           :color      "yellow"
           }
   "752"  {:josm-route :complete
           :josm-stops :todo
           :check-gtfs :todo
           :errata-gtf "McClaren Flat terminal incorrectly located in GTFS"
           :color      "purple"
           }
   "755"  {:josm-route :complete
           :josm-stops :todo
           :check-gtfs :todo
           :errata-gtf "Doesn't go to Willunga school on every trip"
           :color      "green"
           }
   "756"  {:josm-route :complete
           :josm-stops :todo
           :check-gtfs :todo
           :comment    ""
           :color      "brown"
           :errate-gtfs ["Flyover at Victor Harbor Rd / Main Rd not mapped properly."
                         "Seaford Interchange not mapped"]
           }
   "N721" {}
   ;; Hills
   "820"  {}
   "821"  {}
   "822"  {}
   "823"  {}
   "830F" {:josm-route :complete
           :josm-stops :todo
           :check-gtfs :todo
           :comment    "Multiple subroutes used"
           :errata     "Routing at end of route in Lobethal not shown correctly."
           :color      "green"
           }
   "834"  {:josm-route :complete
           :josm-stops :todo
           :check-gtfs :todo
           :comment    "Multiple subroutes used"
           :color      "red"
           }
   "834A"  {:josm-route :complete
            :josm-stops :todo
            :check-gtfs :todo
            :comment    "red"
            }
   "835"  {:josm-route :complete
           :josm-stops :todo
           :check-gtfs :todo
           :comment    "cyan"
           }
   "835A"  {:josm-route :complete
            :josm-stops :todo
            :check-gtfs :todo
            :comment    "cyan"
            }
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
