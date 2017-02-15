(defproject com.howardlewisship/bgg-graphql-proxy "0.12.0"
  :description "GraphQL interface to BoardGameGeek"
  :dependencies [[org.clojure/clojure "1.9.0-alpha14"]
                 [io.aviso/logging "0.2.0"]
                 [com.walmartlabs/lacinia "NEXT"]
                 [clj-http "2.3.0"]
                 [org.clojure/data.json "0.2.6"]
                 [org.clojure/data.xml "0.0.8"]
                 [io.pedestal/pedestal.service "0.5.2"]
                 [io.pedestal/pedestal.jetty "0.5.2"]]
  :repositories [["ereceipts-releases"
                  "http://dfw-receipts-jenkins.mobile.walmart.com:8081/nexus/content/repositories/releases/"]]
  :codox {:source-uri ""
          :metadata {:doc/format :markdown}})
