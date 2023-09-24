(ns myshelf-application.events
  (:require
   [re-frame.core :as re-frame]
   [myshelf-application.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))
