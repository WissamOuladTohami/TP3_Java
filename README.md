# Exercice 1 : Somme des n premiers termes de la série harmonique

## Points clés

Lire la valeur de n depuis l’utilisateur.

Utiliser une boucle pour additionner chaque terme 
1
𝑖
i
1
	​
  ---

## Résultat Attendu

<img width="1112" height="238" alt="TP31" src="https://github.com/user-attachments/assets/f46581c5-a880-49c3-aac0-5744c5cd0e7b" />

---

# Exercice 2 : Triangle isocèle d’étoiles
## Objectif

Afficher un triangle isocèle formé d’étoiles *, dont la hauteur est donnée par l’utilisateur.

---

## Points clés

La hauteur n est lue depuis l’utilisateur.

Chaque ligne i contient 2*i - 1 étoiles.

Pas d’espace à gauche, la dernière ligne commence au bord gauche de l’écran.

---

## Résultat Attendu

<img width="1115" height="291" alt="TP32" src="https://github.com/user-attachments/assets/bbbe7df0-875f-4fd1-b2ca-644193a3bd94" />

---

# Exercice 3 : Carrés des n premiers nombres impairs
## Objectif

Créer un tableau contenant les carrés des n premiers nombres impairs et les afficher dans un format lisible.

---

## Points clés

La valeur de n est lue depuis l’utilisateur.

Les nombres impairs se calculent comme : 2*i - 1 pour i = 1..n.

Stocker chaque carré dans un tableau int[].

Affichage au format : <nombre> a pour carre <carré>.

---

## Résultat Attendu

<img width="1115" height="297" alt="TP33" src="https://github.com/user-attachments/assets/dfe65827-cfb4-4dd3-b242-1e26156bed05" />

---

# Exercice 4 : Classe utilitaire pour tableaux 2D de double
## Objectif

Créer une classe utilitaire pour manipuler des tableaux de tableaux de double (double[][]) avec plusieurs méthodes statiques :

Affichage

Vérification de régularité

Sommes par ligne

Somme élément par élément de deux tableaux

---

## Points clés

Un tableau régulier a toutes ses lignes de même longueur.

Les méthodes doivent être statiques pour pouvoir être utilisées sans instancier la classe.

La méthode somme retourne null si les dimensions ne correspondent pas ou si les tableaux ne sont pas réguliers.

---

## Résultat Attendu

<img width="1115" height="295" alt="TP34" src="https://github.com/user-attachments/assets/3dfaf4ff-ecfb-41eb-a640-82051bb0d81d" />

---

# Exercice 5 : Rotation en place d’une matrice N×N
## Objectif

Faire pivoter une matrice carrée N×N de 90° dans le sens horaire, en mémoire O(1) (pas de second tableau), uniquement avec boucles et tableaux.

---

## Points clés

Méthode 1 (conseillée) :

Transposition : échanger A[i][j] et A[j][i] pour i < j.

Renversement des lignes : échanger A[i][j] et A[i][N-1-j].

Méthode 2 (bonus) : rotation par couches (échanger 4 éléments à la fois pour chaque “anneau”).

Contrainte : pas de listes ou de récursion, N ∈ [2, 200].

---

## Résultat Attendu

<img width="1112" height="735" alt="TP35" src="https://github.com/user-attachments/assets/30a0f7c3-2932-4c0f-a50f-7e98718db56f" />

---

# Exercice 6 : Fenêtre glissante – nombre de valeurs distinctes par fenêtre
## Objectif

Calculer pour chaque sous-tableau (fenêtre) de taille k le nombre d’éléments distincts, en utilisant uniquement boucles et tableaux, avec complexité O(n).

---

## Points clés

Tableau T de taille n (1 ≤ n ≤ 100000)

Fenêtre de taille k (1 ≤ k ≤ n)

Valeurs de T dans [0..100000] → utilisation d’un tableau freq pour compter les occurrences

Fenêtre glissante : ajouter l’élément entrant, retirer l’élément sortant

Mise à jour du compteur distinct :

si freq[x] passe de 0 → 1 : distinct++

si freq[x] passe de 1 → 0 : distinct--

Aucun Set/Map/List, seulement tableaux et boucles

Algorithme

Lire n, k et le tableau T de taille n.

Créer freq de taille MAXV+1 (ici 100001), initialisé à 0.

Initialiser la première fenêtre [0..k-1] :

pour chaque élément x :

freq[x]++;
if (freq[x] == 1) distinct++;


Afficher distinct pour la première fenêtre.

Glisser la fenêtre de i = k à n-1 :

Retirer out = T[i-k] :

freq[out]--;
if (freq[out] == 0) distinct--;


Ajouter in = T[i] :

freq[in]++;
if (freq[in] == 1) distinct++;


Afficher distinct

Afficher tous les résultats sur une seule ligne.

---

## Résultat Attendu 

<img width="1112" height="452" alt="TP36" src="https://github.com/user-attachments/assets/c9739680-b2e3-4fe4-ac17-24493dcb2cc3" />



