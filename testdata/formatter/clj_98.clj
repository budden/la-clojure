(ns timda.core
  (:require [timda.core]
   [clojure.contrib.string :as string])
  (:import [javax.mail Session MessagingException Folder]
           [javax.mail.internet InternetAddress]
           [java.io File]))

(defn a [a b c]
  (let [d a
        e (fn [x y]
      (+ b
        (/ x y)))
        f c])
  )