using Microsoft.AspNetCore.Mvc;
using ProductManager.Models;

namespace ProductManager.Controllers
{

    [Route("dotnet")]
    public class ProductsController : ControllerBase
    {

        [HttpGet("product/{name}")]
        public ActionResult<Product> GetProductByName(string name)
        {
            return Ok(new Product(name, "125abc"));
        }
    }
}