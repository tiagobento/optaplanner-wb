import * as AppFormer from "appformer-js";
import * as HomeApi from "kie-wb-common-home-api";
import { OptaplannerWbHomeScreenProvider } from "./OptaplannerWbHomeScreenProvider";

AppFormer.register(new HomeApi.HomeScreenAppFormerComponent(new OptaplannerWbHomeScreenProvider()));
