(defproject ajax-chat-clojure "0.0.1-SNAPSHOT"
  :description "FIXME: write this!"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.7.228"]
                 [ring "1.4.0"]
                 [compojure "1.5.0"]
                 [reagent "0.6.0-alpha"]
                 [cljs-ajax "0.5.4"]]
  :source-paths ["src/clj"]
  :javac-options ["-target" "1.6" "-source" "1.6" "-Xlint:-options"]
  :cljsbuild {:builds [{:source-paths ["src/cljs"]
                        :compiler {:output-to "resources/public/cljs.js"
                                   :optimizations :advanced
                                   :pretty-print false}
                        :jar true}]}
  :aot [ajax-chat-clojure.core]
  :main ajax-chat-clojure.core
  :ring {:handler ajax-chat-clojure.core/app})
