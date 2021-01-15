namespace ProductManager.Models
{
    public class Product
    {
        public string name { get; set; }
        public string sku { get; set; }

        public Product(string name, string sku)
        {
            this.name = name;
            this.sku = sku;
        }

    }
}