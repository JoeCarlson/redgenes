(ns re-frame-boiler.components.icons)

;;TO USE AN SVG INLINE, do it like so:
;;[:svg.icon.icon-share [:use {:xlinkHref "#icon-share"}]]
;;The definitions of icons are below ) use the part after # in the symbol
;;tag as identifiers.

(defn icons []
  [:svg
  {:version "1.1",
   :height "0",
   :width "0",
   :style {:position "absolute" :width 0 :height 0}}
  [:defs
   [:symbol#icon-bar-chart
    {:viewBox "0 0 32 28"}
    [:title "bar-chart"]
    [:path.path1
     {:d
      "M10 14v8h-4v-8h4zM16 6v16h-4v-16h4zM32 24v2h-32v-24h2v22h30zM22 10v12h-4v-12h4zM28 4v18h-4v-18h4z"}]]
   [:symbol#icon-floppy-disk
    {:viewBox "0 0 16 16"}
    [:title "floppy-disk"]
    [:path.path1
     {:d
      "M14 0h-14v16h16v-14l-2-2zM8 2h2v4h-2v-4zM14 14h-12v-12h1v5h9v-5h1.172l0.828 0.828v11.172z"}]]
   [:symbol#icon-user
    {:viewBox "0 0 16 16"}
    [:title "user"]
    [:path.path1
     {:d
      "M9 11.041v-0.825c1.102-0.621 2-2.168 2-3.716 0-2.485 0-4.5-3-4.5s-3 2.015-3 4.5c0 1.548 0.898 3.095 2 3.716v0.825c-3.392 0.277-6 1.944-6 3.959h14c0-2.015-2.608-3.682-6-3.959z"}]]
   [:symbol#icon-cog
    {:viewBox "0 0 16 16"}
    [:title "cog"]
    [:path.path1
     {:d
      "M14.59 9.535c-0.839-1.454-0.335-3.317 1.127-4.164l-1.572-2.723c-0.449 0.263-0.972 0.414-1.529 0.414-1.68 0-3.042-1.371-3.042-3.062h-3.145c0.004 0.522-0.126 1.051-0.406 1.535-0.839 1.454-2.706 1.948-4.17 1.106l-1.572 2.723c0.453 0.257 0.845 0.634 1.123 1.117 0.838 1.452 0.336 3.311-1.12 4.16l1.572 2.723c0.448-0.261 0.967-0.41 1.522-0.41 1.675 0 3.033 1.362 3.042 3.046h3.145c-0.001-0.517 0.129-1.040 0.406-1.519 0.838-1.452 2.7-1.947 4.163-1.11l1.572-2.723c-0.45-0.257-0.839-0.633-1.116-1.113zM8 11.24c-1.789 0-3.24-1.45-3.24-3.24s1.45-3.24 3.24-3.24c1.789 0 3.24 1.45 3.24 3.24s-1.45 3.24-3.24 3.24z"}]]
   [:symbol#icon-arrow-right
    {:viewBox "0 0 32 32"}
    [:title "arrow-right"]
    [:path.path1
     {:d
      "M31 16l-15-15v9h-16v12h16v9z"}]]
   [:symbol#icon-download
    {:viewBox "0 0 16 16"}
    [:title "download"]
    [:path.path1
     {:d
      "M11.5 7l-4 4-4-4h2.5v-6h3v6zM7.5 11h-7.5v4h15v-4h-7.5zM14 13h-2v-1h2v1z"}]]
   [:symbol#icon-star-empty
    {:viewBox "0 0 16 16"}
    [:title "star-empty"]
    [:path.path1
     {:d
      "M16 6.204l-5.528-0.803-2.472-5.009-2.472 5.009-5.528 0.803 4 3.899-0.944 5.505 4.944-2.599 4.944 2.599-0.944-5.505 4-3.899zM8 11.773l-3.492 1.836 0.667-3.888-2.825-2.753 3.904-0.567 1.746-3.537 1.746 3.537 3.904 0.567-2.825 2.753 0.667 3.888-3.492-1.836z"}]]
   [:symbol#icon-star-full
    {:viewBox "0 0 16 16"}
    [:title "star-full"]
    [:path.path1
     {:d
      "M16 6.204l-5.528-0.803-2.472-5.009-2.472 5.009-5.528 0.803 4 3.899-0.944 5.505 4.944-2.599 4.944 2.599-0.944-5.505 4-3.899z"}]]
   [:symbol#icon-question
    {:viewBox "0 0 16 16"}
    [:title "question"]
    [:path.path1
     {:d
      "M7 11h2v2h-2zM11 4c0.552 0 1 0.448 1 1v3l-3 2h-2v-1l3-2v-1h-5v-2h6zM8 1.5c-1.736 0-3.369 0.676-4.596 1.904s-1.904 2.86-1.904 4.596c0 1.736 0.676 3.369 1.904 4.596s2.86 1.904 4.596 1.904c1.736 0 3.369-0.676 4.596-1.904s1.904-2.86 1.904-4.596c0-1.736-0.676-3.369-1.904-4.596s-2.86-1.904-4.596-1.904zM8 0v0c4.418 0 8 3.582 8 8s-3.582 8-8 8c-4.418 0-8-3.582-8-8s3.582-8 8-8z"}]]
   [:symbol#icon-plus
    {:viewBox "0 0 16 16"}
    [:title "plus"]
    [:path.path1
     {:d
      "M15.5 6h-5.5v-5.5c0-0.276-0.224-0.5-0.5-0.5h-3c-0.276 0-0.5 0.224-0.5 0.5v5.5h-5.5c-0.276 0-0.5 0.224-0.5 0.5v3c0 0.276 0.224 0.5 0.5 0.5h5.5v5.5c0 0.276 0.224 0.5 0.5 0.5h3c0.276 0 0.5-0.224 0.5-0.5v-5.5h5.5c0.276 0 0.5-0.224 0.5-0.5v-3c0-0.276-0.224-0.5-0.5-0.5z"}]]
   [:symbol#icon-minus
    {:viewBox "0 0 16 16"}
    [:title "minus"]
    [:path.path1
     {:d
      "M0 6.5v3c0 0.276 0.224 0.5 0.5 0.5h15c0.276 0 0.5-0.224 0.5-0.5v-3c0-0.276-0.224-0.5-0.5-0.5h-15c-0.276 0-0.5 0.224-0.5 0.5z"}]]
   [:symbol#icon-external
    {:viewBox "0 0 16 16"}
    [:title "external link"]
    [:path.path1
     {:d
      "M4 10c0 0 0.919-3 6-3v3l6-4-6-4v3c-4 0-6 2.495-6 5zM11 12h-9v-6h1.967c0.158-0.186 0.327-0.365 0.508-0.534 0.687-0.644 1.509-1.135 2.439-1.466h-6.914v10h13v-4.197l-2 1.333v0.864z"}]]
  [:symbol#icon-waiting
    {:viewBox "0 0 16 16"}
    [:title "waiting"]
    [:path.path1
     {:d
      "M6 2c0-1.105 0.895-2 2-2s2 0.895 2 2c0 1.105-0.895 2-2 2s-2-0.895-2-2zM10.243 3.757c0-1.105 0.895-2 2-2s2 0.895 2 2c0 1.105-0.895 2-2 2s-2-0.895-2-2zM13 8c0-0.552 0.448-1 1-1s1 0.448 1 1c0 0.552-0.448 1-1 1s-1-0.448-1-1zM11.243 12.243c0-0.552 0.448-1 1-1s1 0.448 1 1c0 0.552-0.448 1-1 1s-1-0.448-1-1zM7 14c0 0 0 0 0 0 0-0.552 0.448-1 1-1s1 0.448 1 1c0 0 0 0 0 0 0 0.552-0.448 1-1 1s-1-0.448-1-1zM2.757 12.243c0 0 0 0 0 0 0-0.552 0.448-1 1-1s1 0.448 1 1c0 0 0 0 0 0 0 0.552-0.448 1-1 1s-1-0.448-1-1zM2.257 3.757c0 0 0 0 0 0 0-0.828 0.672-1.5 1.5-1.5s1.5 0.672 1.5 1.5c0 0 0 0 0 0 0 0.828-0.672 1.5-1.5 1.5s-1.5-0.672-1.5-1.5zM0.875 8c0-0.621 0.504-1.125 1.125-1.125s1.125 0.504 1.125 1.125c0 0.621-0.504 1.125-1.125 1.125s-1.125-0.504-1.125-1.125z"}]]

      [:symbol#icon-heatmap
     {:viewBox "0 0 16 16"}
     [:title "heatmap"]
     [:path.path1
      {:d
       "M0 1v14h16v-14h-16zM6 10v-3h4v3h-4zM10 11v3h-4v-3h4zM10 3v3h-4v-3h4zM5 3v3h-4v-3h4zM1 7h4v3h-4v-3zM11 7h4v3h-4v-3zM11 6v-3h4v3h-4zM1 11h4v3h-4v-3zM11 14v-3h4v3h-4z"}]]

       [:symbol#icon-tree
      {:viewBox "0 0 16 16"}
      [:title "tree"]
      [:path.path1
       {:d
        "M15.25 12h-0.25v-3.25c0-0.965-0.785-1.75-1.75-1.75h-4.25v-2h0.25c0.412 0 0.75-0.338 0.75-0.75v-2.5c0-0.413-0.338-0.75-0.75-0.75h-2.5c-0.412 0-0.75 0.337-0.75 0.75v2.5c0 0.412 0.338 0.75 0.75 0.75h0.25v2h-4.25c-0.965 0-1.75 0.785-1.75 1.75v3.25h-0.25c-0.412 0-0.75 0.338-0.75 0.75v2.5c0 0.412 0.338 0.75 0.75 0.75h2.5c0.413 0 0.75-0.338 0.75-0.75v-2.5c0-0.412-0.337-0.75-0.75-0.75h-0.25v-3h4v3h-0.25c-0.412 0-0.75 0.338-0.75 0.75v2.5c0 0.412 0.338 0.75 0.75 0.75h2.5c0.412 0 0.75-0.338 0.75-0.75v-2.5c0-0.412-0.338-0.75-0.75-0.75h-0.25v-3h4v3h-0.25c-0.412 0-0.75 0.338-0.75 0.75v2.5c0 0.412 0.338 0.75 0.75 0.75h2.5c0.412 0 0.75-0.338 0.75-0.75v-2.5c0-0.412-0.338-0.75-0.75-0.75zM3 15h-2v-2h2v2zM9 15h-2v-2h2v2zM7 4v-2h2v2h-2zM15 15h-2v-2h2v2z"}]]

[:symbol#icon-biological-process
    {:viewBox "0 0 16 16"}
    [:title "biological process"]
    [:path.path1
     {:d
      "M12.775 5.44c-3.024-2.248-4.067-4.047-4.774-5.44v0c-0 0-0-0-0-0v0c-0.708 1.393-1.75 3.192-4.774 5.44-5.157 3.833-0.303 9.182 3.965 6.238-0.278 1.827-1.227 3.159-2.191 3.733v0.59h6v-0.59c-0.964-0.574-1.913-1.906-2.191-3.733 4.268 2.944 9.122-2.405 3.965-6.238z"}]]

  [:symbol#icon-cellular-component
      {:viewBox "0 0 16 16"}
      [:title "cellular component"]
      [:path.path1 {:d "M8 0l-5 8 5 8 5-8z"}]]

        [:symbol#icon-molecular-function
        {:viewBox "0 0 16 16"}
        [:title "molecular function"]
        [:path.path1
         {:d
          "M12.294 6.137c-0.922 0-1.751 0.384-2.341 1.011-0.25 0.265-0.684 0.58-1.153 0.856 0.22-0.842 0.917-1.902 1.4-2.367 0.619-0.596 1-1.435 1-2.367 0-1.795-1.429-3.252-3.2-3.271-1.771 0.019-3.2 1.475-3.2 3.271 0 0.932 0.38 1.771 1 2.367 0.484 0.465 1.18 1.525 1.4 2.367-0.469-0.277-0.903-0.591-1.153-0.856-0.59-0.627-1.419-1.011-2.341-1.011-1.787 0-3.236 1.463-3.236 3.271s1.448 3.271 3.236 3.271c0.923 0 1.751-0.396 2.341-1.023 0.263-0.279 0.726-0.627 1.223-0.916-0.047 2.308-1.149 4.003-2.271 4.67v0.59h6v-0.59c-1.122-0.668-2.224-2.363-2.271-4.67 0.498 0.289 0.961 0.637 1.223 0.916 0.59 0.626 1.419 1.023 2.341 1.023 1.787 0 3.236-1.464 3.236-3.271s-1.448-3.271-3.236-3.271z"}]]

   [:symbol#icon-summary
     {:viewBox "0 0 16 16"}
     [:title "summary"]
     [:path.path1
      {:d
       "M13.5 0h-12c-0.825 0-1.5 0.675-1.5 1.5v13c0 0.825 0.675 1.5 1.5 1.5h12c0.825 0 1.5-0.675 1.5-1.5v-13c0-0.825-0.675-1.5-1.5-1.5zM13 14h-11v-12h11v12zM4 7h7v1h-7zM4 9h7v1h-7zM4 11h7v1h-7zM4 5h7v1h-7z"}]]

       [:symbol#icon-enrichment
      {:viewBox "0 0 16 16"}
      [:title "enrichment"]
      [:path.path1
       {:d
        "M5 2h-2c-0.55 0-1 0.45-1 1v2c0 0.55 0.45 1 1 1h2c0.55 0 1-0.45 1-1v-2c0-0.55-0.45-1-1-1z"}]
      [:path.path2
       {:d
        "M11 6h2c0.55 0 1-0.45 1-1v-2c0-0.55-0.45-1-1-1h-2c-0.55 0-1 0.45-1 1v2c0 0.55 0.45 1 1 1zM11 3h2v2h-2v-2z"}]
      [:path.path3
       {:d
        "M5 10h-2c-0.55 0-1 0.45-1 1v2c0 0.55 0.45 1 1 1h2c0.55 0 1-0.45 1-1v-2c0-0.55-0.45-1-1-1zM5 13h-2v-2h2v2z"}]
      [:path.path4
       {:d
        "M13 10h-2c-0.55 0-1 0.45-1 1v2c0 0.55 0.45 1 1 1h2c0.55 0 1-0.45 1-1v-2c0-0.55-0.45-1-1-1z"}]
      [:path.path5
       {:d
        "M14 8h-1c-1.336 0-2.591-0.52-3.536-1.464s-1.464-2.2-1.464-3.536v-1c0-1.1-0.9-2-2-2h-4c-1.1 0-2 0.9-2 2v4c0 1.1 0.9 2 2 2h1c1.336 0 2.591 0.52 3.536 1.464s1.464 2.2 1.464 3.536v1c0 1.1 0.9 2 2 2h4c1.1 0 2-0.9 2-2v-4c0-1.1-0.9-2-2-2zM15 14c0 0.265-0.105 0.515-0.295 0.705s-0.44 0.295-0.705 0.295h-4c-0.265 0-0.515-0.105-0.705-0.295s-0.295-0.44-0.295-0.705v-1c0-3.314-2.686-6-6-6h-1c-0.265 0-0.515-0.105-0.705-0.295s-0.295-0.441-0.295-0.705v-4c0-0.265 0.105-0.515 0.295-0.705s0.44-0.295 0.705-0.295h4c0.265 0 0.515 0.105 0.705 0.295s0.295 0.44 0.295 0.705v1c0 3.314 2.686 6 6 6h1c0.265 0 0.515 0.105 0.705 0.295s0.295 0.44 0.295 0.705v4z"}]]

        [:symbol#icon-code
          {:viewBox "0 0 20 16"}
          [:titlbe "code"]
          [:path.path1 {:d "M13 11.5l1.5 1.5 5-5-5-5-1.5 1.5 3.5 3.5z"}]
          [:path.path2 {:d "M7 4.5l-1.5-1.5-5 5 5 5 1.5-1.5-3.5-3.5z"}]
          [:path.path3
           {:d "M10.958 2.352l1.085 0.296-3 11-1.085-0.296 3-11z"}]]

           [:symbol#icon-sad
          {:viewBox "0 0 16 16"}
          [:title "Sad face: error"]
          [:path.path1
           {:d
            "M8 0c-4.418 0-8 3.582-8 8s3.582 8 8 8 8-3.582 8-8-3.582-8-8-8zM11 4c0.552 0 1 0.448 1 1s-0.448 1-1 1-1-0.448-1-1 0.448-1 1-1zM5 4c0.552 0 1 0.448 1 1s-0.448 1-1 1-1-0.448-1-1 0.448-1 1-1zM11.002 12.199c-0.612-1.018-1.727-1.699-3.002-1.699s-2.389 0.681-3.002 1.699l-1.286-0.772c0.874-1.454 2.467-2.427 4.288-2.427s3.414 0.973 4.288 2.427l-1.286 0.772z"}]]

            [:symbol#icon-info
           {:view-box "0 0 16 16"}
           [:title "info"]
           [:path.path1
            {:d
             "M7 4.75c0-0.412 0.338-0.75 0.75-0.75h0.5c0.412 0 0.75 0.338 0.75 0.75v0.5c0 0.412-0.338 0.75-0.75 0.75h-0.5c-0.412 0-0.75-0.338-0.75-0.75v-0.5z"}]
           [:path.path2 {:d "M10 12h-4v-1h1v-3h-1v-1h3v4h1z"}]
           [:path.path3
            {:d
             "M8 0c-4.418 0-8 3.582-8 8s3.582 8 8 8 8-3.582 8-8-3.582-8-8-8zM8 14.5c-3.59 0-6.5-2.91-6.5-6.5s2.91-6.5 6.5-6.5 6.5 2.91 6.5 6.5-2.91 6.5-6.5 6.5z"}]]

  [:symbol#icon-circle-right
    {:view-box "0 0 16 16"}
    [:title "circle-right"]
    [:path.path1
     {:d
      "M8 0c-4.418 0-8 3.582-8 8s3.582 8 8 8 8-3.582 8-8-3.582-8-8-8zM8 14.5c-3.59 0-6.5-2.91-6.5-6.5s2.91-6.5 6.5-6.5 6.5 2.91 6.5 6.5-2.91 6.5-6.5 6.5z"}]
    [:path.path2
     {:d
      "M5.543 11.043l1.414 1.414 4.457-4.457-4.457-4.457-1.414 1.414 3.043 3.043z"}]]

  [:symbol#icon-circle-down
    {:view-box "0 0 16 16"}
    [:title "circle-down"]
    [:path.path1
     {:d
      "M16 8c0-4.418-3.582-8-8-8s-8 3.582-8 8 3.582 8 8 8 8-3.582 8-8zM1.5 8c0-3.59 2.91-6.5 6.5-6.5s6.5 2.91 6.5 6.5-2.91 6.5-6.5 6.5-6.5-2.91-6.5-6.5z"}]
    [:path.path2
     {:d
      "M4.957 5.543l-1.414 1.414 4.457 4.457 4.457-4.457-1.414-1.414-3.043 3.043z"}]]

   [:symbol#icon-search
              {:view-box "0 0 16 16"}
              [:title "search"]
              [:path.path1
               {:d
                "M15.504 13.616l-3.79-3.223c-0.392-0.353-0.811-0.514-1.149-0.499 0.895-1.048 1.435-2.407 1.435-3.893 0-3.314-2.686-6-6-6s-6 2.686-6 6 2.686 6 6 6c1.486 0 2.845-0.54 3.893-1.435-0.016 0.338 0.146 0.757 0.499 1.149l3.223 3.79c0.552 0.613 1.453 0.665 2.003 0.115s0.498-1.452-0.115-2.003zM6 10c-2.209 0-4-1.791-4-4s1.791-4 4-4 4 1.791 4 4-1.791 4-4 4z"}]]

[:symbol#expanded-row
  {:view-box "0 0 16 16"}
    [:title "Expanded row"]
    [:path
      {:stroke-width "2",
       :d "M0 0 L 0 9, L 26 09 L 26 07 L 2 07 L 2 0"}]
     [:path.path2
      {:d
         "M11 11l1.414 1.414 4.457-4.457-4.457-4.457-1.414 1.414 3.043 3.043z"}]]

         [:symbol#icon-eh
           {:view-box "-0.5 -2 7 15"}
             [:title "Eh?"]

              [:path.path
               {:stroke-color "red",
                :d "m 3.12012,10.19104 q 0.36469,0.34443 0.36469,0.81042 0,0.46599 -0.36469,0.81042 -0.34443,0.34443 -0.7699,0.34443 -0.46599,0 -0.83068,-0.34443 -0.36469,-0.34443 -0.36469,-0.81042 0,-0.46599 0.36469,-0.81042 0.36469,-0.36469 0.83068,-0.36469 0.42547,0 0.7699,0.36469 z"}]
                [:path.path2
                 {:d "m 0,0 q 0,0.24313 0.36469,0.68886 0.38495,0.44573 0.38495,0.85094 0,0.38495 -0.24312,0.60781 -0.24313,0.20261 -0.64834,0.20261 -0.91172,0 -0.91172,-1.33719 0,-1.27642 1.03328,-2.04632 1.03329,-0.79016 2.37048,-0.79016 1.6411,0 2.61361,0.97251 0.99276,0.95224 0.99276,2.22866 0,0.60781 -0.26338,1.25615 -0.24313,0.64833 -0.52678,1.03328 -0.26338,0.38495 -0.74963,1.01303 l -0.60782,0.79016 q -1.05355,1.33719 -1.31693,3.0796 l -0.34443,0 q 0,-1.05355 0.30391,-2.06658 0.3039,-1.01302 0.66859,-1.68162 0.36469,-0.68886 0.6686,-1.60058 0.30391,-0.91172 0.30391,-1.78292 0,-1.09407 -0.58756,-1.86397 -0.56729,-0.79016 -1.60058,-0.79016 -0.62807,0 -1.27641,0.34443 -0.62808,0.34443 -0.62808,0.89146 z"}]]

                 [:symbol#icon-filter
                   {:view-box "0 0 16 16"}
                   [:title "filter"]
                   [:path.path1
                    {:d
                     "M8 0c-4.418 0-8 1.119-8 2.5v1.5l6 6v5c0 0.552 0.895 1 2 1s2-0.448 2-1v-5l6-6v-1.5c0-1.381-3.582-2.5-8-2.5zM1.475 2.169c0.374-0.213 0.9-0.416 1.52-0.586 1.374-0.376 3.152-0.583 5.005-0.583s3.631 0.207 5.005 0.583c0.62 0.17 1.146 0.372 1.52 0.586 0.247 0.141 0.38 0.26 0.442 0.331-0.062 0.071-0.195 0.19-0.442 0.331-0.374 0.213-0.9 0.416-1.52 0.586-1.374 0.376-3.152 0.583-5.005 0.583s-3.631-0.207-5.005-0.583c-0.62-0.17-1.146-0.372-1.52-0.586-0.247-0.141-0.38-0.26-0.442-0.331 0.062-0.071 0.195-0.19 0.442-0.331z"}]]

                     [:symbol#icon-file
                    {:view-box "0 0 16 16"}
                    [:title "file upload"]
                    [:path.path1
                     {:d
                      "M14.341 3.579c-0.347-0.473-0.831-1.027-1.362-1.558s-1.085-1.015-1.558-1.362c-0.806-0.591-1.197-0.659-1.421-0.659h-7.75c-0.689 0-1.25 0.561-1.25 1.25v13.5c0 0.689 0.561 1.25 1.25 1.25h11.5c0.689 0 1.25-0.561 1.25-1.25v-9.75c0-0.224-0.068-0.615-0.659-1.421zM12.271 2.729c0.48 0.48 0.856 0.912 1.134 1.271h-2.406v-2.405c0.359 0.278 0.792 0.654 1.271 1.134zM14 14.75c0 0.136-0.114 0.25-0.25 0.25h-11.5c-0.135 0-0.25-0.114-0.25-0.25v-13.5c0-0.135 0.115-0.25 0.25-0.25 0 0 7.749-0 7.75 0v3.5c0 0.276 0.224 0.5 0.5 0.5h3.5v9.75z"}]
                    [:path.path2
                     {:d
                      "M11.5 13h-7c-0.276 0-0.5-0.224-0.5-0.5s0.224-0.5 0.5-0.5h7c0.276 0 0.5 0.224 0.5 0.5s-0.224 0.5-0.5 0.5z"}]
                    [:path.path3
                     {:d
                      "M11.5 11h-7c-0.276 0-0.5-0.224-0.5-0.5s0.224-0.5 0.5-0.5h7c0.276 0 0.5 0.224 0.5 0.5s-0.224 0.5-0.5 0.5z"}]
                    [:path.path4
                     {:d
                      "M11.5 9h-7c-0.276 0-0.5-0.224-0.5-0.5s0.224-0.5 0.5-0.5h7c0.276 0 0.5 0.224 0.5 0.5s-0.224 0.5-0.5 0.5z"}]]





   ]])