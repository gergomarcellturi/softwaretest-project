Történet (Story): Alkoholos ital kiszolgálása amerikai és magyar bárban
Azért, hogy (In Order To) Legális keretek között működhessen a létesítmény
(As a) Pultos
(I want to) Tudni akarom, hogy adott bárban adott személy kiszolgálását megtehetem-e.

# 1. Scenario ("Underage drinking of Josh in 'murica should not be possible")
Scenario: 19 éves Josh nevű egyén italt kér egy amerikai bárban
Given adott Josh életkora - 19
Given adott a bár által szabott minimum életkor a kiszolgáláshoz - 21
When Kiszolgálják Josh-t a bárban
Then Az eredmény: false

# 2. Scenario ("drinking of Josh in hungary should be possible")
Scenario: 19 éves Josh nevű egyén italt kér egy magyar bárban
Given adott Josh életkora - 19
Given adott a bár által szabott minimum életkor a kiszolgáláshoz - 18
When Kiszolgálják Josh-t a bárban
Then Az eredmény: true

# 3. Scenario ("drinking of Amy should be possible anywhere")
Scenario: 22 éves Amy nevű egyén italt kér egy magyar és egy amerikai bárban
Given adott Amy életkora - 2
Given adott a magyar bár által szabott minimum életkor a kiszolgáláshoz - 18
Given adott az amerikai bár által szabott minimum életkor a kiszolgáláshoz - 21
When Kiszolgálják Amy-t a magyar bárban
Then Az eredmény: true
When Kiszolgálják Amy-t az amerikai bárban
Then Az eredmény: true

