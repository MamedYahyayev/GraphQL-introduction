<h1>GraphQL</h1>

<p>GraphQL is a query language for your API, and a server-side runtime for executing queries by using a type system you define for your data. GraphQL isn't tied to any specific database or storage engine and is instead backed by your existing code and data.</p>

<div style = "display:flex;">
  
  <div>  
    <code>
        {
        hero {
            name
          }
        }
      </code>
  </div>
  
  <div>
     <code>
        {
          "data": {
            "hero": {
              "name": "R2-D2"
            }
          }
        }
      </code>
  </div>
  
</div>
