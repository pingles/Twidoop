;; -*- coding: utf-8 -*-
;;
;; © 2009 Digg, Inc. All rights reserved.
;; Author: Ian Eure <ian@digg.com>
;;

(defproject twidoop "0.8.0"
  :description "Read from the firehose, write to Hadoop"
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [clojure-http-client "1.0.0"]
                 [org.clojars.paul.cdh/hadoop-core "3.0-beta-4"]
                 [commons-logging "1.1.1"]
                 [commons-cli "1.2"]]
  :dev-dependencies [[swank-clojure "1.3.0-SNAPSHOT"]]
  :main twidoop)
