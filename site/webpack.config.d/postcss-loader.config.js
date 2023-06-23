(() => {
    const cssRule = config.module.rules.find(r => "test.css".match(r.test));
    if (!cssRule) {
        throw new Error("Could not resolve webpack rule matching .css files, did you forget to enable css support?");
    }
    cssRule.use.push({
        loader: "postcss-loader",
        options: {}
    });
})();