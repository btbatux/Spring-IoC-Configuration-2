# SpringIntro

Bu proje, Spring framework kullanarak bir Java uygulaması geliştirmeyi amaçlar. Bu README dosyası, 
proje hakkında genel bilgileri ve nasıl kullanılacağına dair temel talimatları içerir.

## İçindekiler

1. [Proje Tanımı](#proje-tanımı)
2. [Kurulum](#kurulum)
3. [Kullanım](#kullanım)
4. [Katkıda Bulunma](#katkıda-bulunma)

## Proje Tanımı
Bu XML konfigürasyon dosyası, bir Spring uygulamasında IoC (Inversion of Control) prensibine ve bağımlılık enjeksiyonuna dayalı bir yapılandırma sağlamak için kullanılıyor.

**Namespace Tanımları:** İlk olarak, dosya, Spring XML konfigürasyon dosyaları için gerekli olan namespace'leri ve bunların schema lokasyonlarını tanımlar. Bu, XML dosyasında kullanılacak özel Spring etiketlerinin belirlenmesine yardımcı olur.

**PropertyPlaceholderConfigurer Bean'i:** Bu, PropertyPlaceholderConfigurer sınıfından bir Spring bean'i tanımlar. 
Bu bean, values.properties dosyasındaki değerleri yüklemek için kullanılır. location özelliği, values.properties dosyasının konumunu belirtir.

**Veritabanı Bağlantısı İçin Bean:** Database adında bir Spring bean'i tanımlanır. Bu bean, OracleSqlCustomerDal sınıfından bir örneği temsil eder. 
connectionString özelliği, values.properties dosyasından alınan database.connectionString özelliğine karşılık gelir. Bu şekilde, veritabanı bağlantı bilgileri dışarıdan yapılandırılabilir ve sık sık değişen bilgiler XML dosyasına sabitlenmek zorunda kalmaz.

**Servis İçin Bean:** Service adında bir Spring bean'i tanımlanır. Bu bean, CustomerManager sınıfından bir örneği temsil eder. Constructor enjeksiyonu kullanılarak, bu servisin database adındaki bağımlılığı sağlanır.


## Kurulum
Bu projeyi klonlamak için aşağıdaki komutu kullanabilirsiniz:
git clone https://github.com/btbatux/SpringIntro.git

libs klasöründeki jar'ları build edip projeye dahil etmek için;

springIntro üzerinde sağ tıkla --> Properties --> Java build path --> Classpath --> Add JARs --> libs klasörünü seç ve bütün JAR'ları seçili hale getir --> Apply and close 

## Kullanım
Proje klonlandıktan sonra, gerekli bağımlılıkları yükleyin ve uygulamayı başlatın.

cd SpringIntro
mvn spring-boot:run

## Katkıda Bulunma
Katkıda bulunmak isterseniz, lütfen bir çekme isteği açın. Her türlü katkı, öneri veya geri bildirim son derece değerlidir.

