<h1> Suggested tariffs </h1>

<ul>
    <#list tariffs as t>
        <li>
            <a target="_blank" href="${t.link}">Link</a>
            <ul>
                <#list t.features as f>
                    <li>${f}</li>
                </#list>
            </ul>
        </li>
    </#list>
</ul>