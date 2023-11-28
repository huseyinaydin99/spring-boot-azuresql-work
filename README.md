# spring-boot-azuresql-work

az accoutnt list //azure hesaplarını verir.
az group list //azure grouplarını listeler.
az resource list //kaynakları listeler.
az webapp stop --resource-group btkweb --name btkakademi //btkweb isimli kaynak grubunun içindeki btkakademi kaynağını sonlandırır.
az webapp start --resource-group btkweb --name btkakademi //btkweb isimli kaynak grubunun içindeki btkakademi kaynağını başlatır.
Remove-AzResourceGroup -Name ExampleResourceGroup //Delete resource group

Windows Power Shell modül yükleme
Get-Module az.* -ListAvailable
az
az --version

az spring app delete --resource-group <resource-group-name> --service <Azure-Spring-Apps-instance-name> --name <application-name>

net use * /delete /y //ağ üzerindeki tüm bağlantıları siler.


az login

Spring Boot App Create For Azure		 
az spring app create --resource-group spring-boot-resource-group --service huso-spring-apps --name spring-boot-azuresql11 --runtime-version Java_17 --assign-endpoint

Spring App Deploy For Azure
az spring app deploy --resource-group spring-boot-resource-group --service huso-spring-apps --name spring-boot-azuresql11 --artifact-path target\spring-boot-azuresql-work-0.0.1-SNAPSHOT.jar
