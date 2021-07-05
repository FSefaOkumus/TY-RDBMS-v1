# TY-RDBMS-v1

##Refactored

-Customer Class'ı düzenlendi.
-CustomerController Eklendi.
-Customer ile Product Arasında OneToOne ilişkisi kuruldu.
Embadded annotation'ını kullanarak yapmadım onun yerine 2. bir constructor ile Customer ve Profile i ilişkilendirdim.Bunun sonucunda Profile'in kendi seller için ürettiği iterate eden id aynı zamanda Customer için de ediyor yani Tüm profilleri görmek istediğimizde Seller ve Customerların hepsine ulaşıyoruz.Ayrıca Customer kendi id 'sini üretiyor ve diğer işlemlerde (AddtoCart / Order vs) bu id üzerinden ilerliyoruz.

Güncel olan kodlarda ShoppingCart / Basket ve Order yapıları bulunmuyor. İmplementasyonları üzerinde çalışıyorum.
