<h1> Suggested tariffs </h1>

<ul>
    <#list tariffs as t>
        <li>
            <h2>Name: ${t.name}</h2>
            <h3>Price: ${t.price}</h3>
            <ul>
                <#list t.features as f>
                    <li>${f}</li>
                </#list>
            </ul>
        </li>
    </#list>
</ul>